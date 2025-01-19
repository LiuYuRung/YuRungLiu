from weather import get_weather
from news import get_news
from jokes import get_joke
from greetings import get_greeting
from faq import get_faq, get_faq_answer
from emotion import get_emotion_response
from reminder import set_reminder


#chatbot_response
def chatbot_response(user_input):
    if  "天気" in user_input:
        return get_weather()
    elif "ニュース" in user_input:
        return get_news()
    elif "ジョーク" in user_input:
        return get_joke()
    elif "こんにちは" in user_input or "おはよう" in user_input:
        return get_greeting()
    elif "質問" in user_input:
        return get_faq()  
    elif user_input in ["AI", "Python", "GitHub"]:
        return get_faq_answer(user_input)  # 選択したカテゴリに対する回答を返す           
    elif "リマインド" in user_input: #[リマインド minutes task]
        parts = user_input.split(" ")
        if len(parts) >= 3:  # partsのサイズを確認
            try:
                minutes = int(parts[1])
                task = " ".join(parts[2:])
                return set_reminder(minutes, task)
            except ValueError:
                return "リマインドの形式が間違っています。'5分後に〇〇をリマインドして'と入力してください。"
    elif  user_input.lower() in ["exit", "終了", "quit","ない"]:
            return("チャットボットを終了します。")
    else:
        return get_emotion_response(user_input)

if __name__ == "__main__":
    #ここのコードわかんないけど終了を入力してもチャットボット終了しなかった
    while True:
        user_input = input("あなたのメッセージ: ")
        if user_input.lower() in ["exit", "終了", "quit","ない"]:
            print("チャットボットを終了します。")
            break
        response = chatbot_response(user_input)
        
        print(response)