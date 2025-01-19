def get_emotion_response(user_input):
    # 悲しい場合の応答
    if "悲しい" in user_input or "つらい" in user_input:
        return "大丈夫ですか？つらい時には、誰かに話を聞いてもらうのも大事ですよ。"
    # 嬉しい場合の応答
    elif "嬉しい" in user_input or "幸せ" in user_input:
        return "それは素晴らしいですね！私も嬉しいです！"
    # 疲れた場合の応答
    elif "疲れ" in user_input or "ストレス" in user_input or "だるい" in user_input:
        return "少し休憩しましょう。リラックスが大事です！"
    # 怒っている場合の応答
    elif "怒っている" in user_input or "イライラ" in user_input:
        return "怒っているんですね。冷静になる時間が必要かもしれません。"
    # テストについての応答
    elif "テスト" in user_input or "授業" in user_input or "勉強" in user_input:
        return "勉強は大変だけれども、きっと力になりますよ。応援してます！"
    # 眠いについての応答
    elif "眠い" in user_input or "ねむい" in user_input:
        return "ブラックコーヒーはお好きですか？目が覚めるのでおススメです！"
    # 感謝の感情の場合の応答
    elif "ありがとう" in user_input or "助かった" in user_input:
        return "どういたしまして！"
    elif "面白い" in user_input or "おもしろい" in user_input:
        return "私がですか？そんなそんな！照れちゃいます"
    else:
        return "感情について話したいことがあれば、何でも聞かせてください。"
