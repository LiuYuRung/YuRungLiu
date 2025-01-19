import requests  # APIリクエスト用にrequestsをインポート

# ニュース情報を取得する関数
def get_news():
    api_key = "5fe3a0ef4b36458b9e6244a1f04578e8"  # NewsAPIのキーを指定
    url = f"https://newsapi.org/v2/top-headlines?country=jp&apiKey={api_key}"
    
    

    try:
        response = requests.get(url)  # APIリクエストを送信
        data = response.json()  # JSON形式でデータを取得

        if response.status_code == 200:  # レスポンスが成功した場合
            articles = data["articles"][:5]  # 最初の5件のニュース記事を取得
            # ニュースリストを整形して返す
            news_list = [f"{i+1}. {article['title']}" for i, article in enumerate(articles)]
            return "今日のトップニュース:\n" + "\n".join(news_list)  # ニュース一覧を返す
        else:
            return "ニュース情報を取得できませんでした。"  # エラーメッセージ
    
    except Exception as e:  # 例外処理
        return f"エラーが発生しました: {e}"  # エラー時の応答

