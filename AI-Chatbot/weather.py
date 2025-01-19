
import requests

# 天気情報を取得する関数
def get_weather(city="Tokyo"):
    api_key = "697db9643bfacee2f146af57ae756fe3"  # 実際のAPIキーをここに入力
    url = f"http://api.openweathermap.org/data/2.5/weather?q={city}&appid={api_key}&units=metric&lang=ja"
    
    try:
        response = requests.get(url)  # APIリクエスト
        data = response.json()  # 取得したデータをJSON形式に変換
        print(f"APIリクエストステータス: {response.status_code}")  # デバッグ用のステータスコード出力
        
        if response.status_code == 200:  # リクエストが成功した場合
            weather_desc = data["weather"][0]["description"]  # 天気の説明
            temp = data["main"]["temp"]  # 気温
            return f"{city}の天気: {weather_desc}、気温: {temp}度です。"
        else:
            return f"天気情報を取得できませんでした（ステータスコード: {response.status_code}）"
    except requests.exceptions.RequestException as e:
        # リクエストエラーが発生した場合
        return f"接続エラー: {e}"
