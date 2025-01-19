import flet as ft
import threading
from main import chatbot_response # チャットボットの応答をインポート
from reminder import get_reminder_message


class Message:
    def __init__(self, user_name: str, text: str, message_type: str):
        self.user_name = user_name
        self.text = text
        self.message_type = message_type

class ChatMessage(ft.Row):
    def __init__(self, message: Message):
        super().__init__()
        self.vertical_alignment = ft.CrossAxisAlignment.START
        self.controls = [
            ft.CircleAvatar(
                content=ft.Text(self.get_initials(message.user_name)),
                color=ft.colors.WHITE,
                bgcolor=self.get_avatar_color(message.user_name),
            ),
            ft.Column(
                [
                    ft.Text(message.user_name, weight="bold"),
                    ft.Text(message.text, selectable=True),
                ],
                tight=True,
                spacing=5,
            ),
        ]

    def get_initials(self, user_name: str):
        if user_name:
            return user_name[:1].capitalize()
        else:
            return "不明"  # 名前がない場合の対応

    def get_avatar_color(self, user_name: str):
        colors_lookup = [
            ft.colors.AMBER, ft.colors.BLUE, ft.colors.BROWN,
            ft.colors.CYAN, ft.colors.GREEN, ft.colors.INDIGO,
            ft.colors.LIME, ft.colors.ORANGE, ft.colors.PINK,
            ft.colors.PURPLE, ft.colors.RED, ft.colors.TEAL,
            ft.colors.YELLOW,
        ]
        return colors_lookup[hash(user_name) % len(colors_lookup)]

def main(page: ft.Page):
    page.horizontal_alignment = ft.CrossAxisAlignment.STRETCH
    page.title = "Flet チャットボット"

    def join_chat_click(e):
        if not join_user_name.value:
            join_user_name.error_text = "名前を入力してください！"
            join_user_name.update()
        else:
            page.session.set("user_name", join_user_name.value)
            page.dialog.open = False
            new_message.prefix = ft.Text(f"{join_user_name.value}: ")
            # チャットに参加したことを通知
            page.pubsub.send_all(
                Message(
                    user_name=join_user_name.value,
                    text=f"{join_user_name.value}さんがチャットに参加しました。",
                    message_type="login_message",
                )
            )
            page.update()

    def send_message_click(e):
        if new_message.value != "":
            user_name = page.session.get("user_name")
            user_message = new_message.value

            # ユーザーのメッセージを表示
            page.pubsub.send_all(
                Message(
                    user_name=user_name,
                    text=user_message,
                    message_type="chat_message",
                )
            )
            new_message.value = ""  # 入力フィールドをクリア

            # チャットボットの応答を取得して表示
            bot_response = chatbot_response(user_message)
            page.pubsub.send_all(
                Message(
                    user_name="チャットボット",  # ボットの名前
                    text=bot_response,
                    message_type="chat_message",
                )
            )
            new_message.focus()
            page.update()

    def on_message(message: Message):
        if message.message_type == "chat_message":
            m = ChatMessage(message)
        elif message.message_type == "login_message":
            m = ft.Text(message.text, italic=True, color=ft.colors.BLACK45, size=12)
        chat.controls.append(m)
        page.update()

    page.pubsub.subscribe(on_message)

    # reminder check
    def check_reminder():
        reminder_message = get_reminder_message()
        if reminder_message:
            page.pubsub.send_all(
                Message(
                    user_name="チャットボット",  # ボットの名前
                    text=reminder_message,
                    message_type="chat_message",
                )
            )
            new_message.focus()
            page.update()
        threading.Timer(1, check_reminder).start()
    
    check_reminder()

    # ユーザー名を入力するダイアログ
    join_user_name = ft.TextField(
        label="チャットに参加するための名前を入力してください",
        autofocus=True,
        on_submit=join_chat_click,
    )
    page.dialog = ft.AlertDialog(
        open=True,
        modal=True,
        title=ft.Text("ようこそ！"),
        content=ft.Column([join_user_name], width=300, height=70, tight=True),
        actions=[ft.ElevatedButton(text="チャットに参加", on_click=join_chat_click)],
        actions_alignment=ft.MainAxisAlignment.END,
    )

    # チャットメッセージ
    chat = ft.ListView(
        expand=True,
        spacing=10,
        auto_scroll=True,
    )

    # 新しいメッセージ入力フォーム
    new_message = ft.TextField(
        hint_text="メッセージを入力してください...",
        autofocus=True,
        shift_enter=True,
        min_lines=1,
        max_lines=5,
        filled=True,
        expand=True,
        on_submit=send_message_click,
    )

    # ページにすべての要素を追加
    page.add(
        ft.Container(
            content=chat,
            border=ft.border.all(1, ft.colors.OUTLINE),
            border_radius=5,
            padding=10,
            expand=True,
        ),
        ft.Row(
            [
                new_message,
                ft.IconButton(
                    icon=ft.icons.SEND_ROUNDED,
                    tooltip="メッセージを送信",
                    on_click=send_message_click,
                ),
            ]
        ),
    )

ft.app(target=main)