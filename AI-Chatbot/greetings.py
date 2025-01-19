
    
import random  # ランダムに挨拶メッセージを選ぶためにrandomをインポート
from datetime import datetime  # 現在の時間に基づいて挨拶を変更するためにdatetimeをインポート

# ユーザーの時間に応じた挨拶メッセージを返す関数
def get_greeting():
    current_hour = datetime.now().hour  # 現在の時刻の時間部分を取得

    # 時間帯に応じて挨拶を変更
    if current_hour < 12:
        time_greeting = "おはようございます！"
    elif current_hour < 18:
        time_greeting = "こんにちは！"
    else:
        time_greeting = "こんばんは！"

    greetings = [
        "今日も素敵な一日を！",
        "何かお手伝いできることはありますか？",
        "あなたのことをお待ちしていました！",
        "最近どうですか？"
    ]
    
    random_greeting = random.choice(greetings)  # ランダムに挨拶フレーズを選ぶ
    return f"{time_greeting} {random_greeting}"  # 挨拶文を返す



