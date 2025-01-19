import time  # 時間を管理するためにtimeモジュールをインポート
import threading  # リマインダーを並行処理するためにthreadingをインポート

reminder = ""

# 指定された分数後にリマインダーを実行する関数
def set_reminder(minutes, task):
    # リマインダーをバックグラウンドで実行するスレッドを定義
    def reminder_thread():
        time.sleep(minutes * 60)  # 指定された分数後に実行（分を秒に変換）
        global reminder 
        reminder = f"リマインダー: {task}の時間です！"
        print(f"リマインダー: {task}の時間です！")  # リマインダー通知

    thread = threading.Thread(target=reminder_thread)  # 新しいスレッドを作成
    thread.start()  # スレッドを開始してリマインダーを実行
    return f"{minutes}分後に'{task}'をリマインドします。"  # リマインダー設定の確認メッセージを返す

def get_reminder_message():
    global reminder
    if reminder:
        message = reminder
        reminder = ""
        return message   # リマインダー通知
    return ""

