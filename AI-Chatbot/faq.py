
# faq.py
def get_faq():
    faqs = {
        "AI": "AIは人工知能のことです。人間のように学習し、タスクをこなすコンピューター技術です。",
        "Python": "Pythonは非常に人気のあるプログラミング言語で、シンプルで読みやすい構文が特徴です。",
        "GitHub": "GitHubは、コードを共有し、プロジェクトを共同開発するためのプラットフォームです。"
    }

    return("FAQカテゴリ: AI, Python, GitHub から選んでください。")
def get_faq_answer(category):
    faqs = {
        "AI": "AIは人工知能のことです。人間のように学習し、タスクをこなすコンピューター技術です。",
        "Python": "Pythonは非常に人気のあるプログラミング言語で、シンプルで読みやすい構文が特徴です。",
        "GitHub": "GitHubは、コードを共有し、プロジェクトを共同開発するためのプラットフォームです。"
    }

    return faqs.get(category, "すみません、そのカテゴリについてはまだ情報がありません。")
