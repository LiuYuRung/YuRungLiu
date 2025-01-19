class Person{
    //フィールドの宣言
    private String name; //名前
    private int age;     //年齢

    //コンストラクタでフィールドに値を設定
    public Person(String _name, int _age) {
        name = _name;
        age = _age;
    }

    //名前を取得する処理
    public String getName() {
        return name;
    }

    //年齢を取得する処理
    public int getAge() {
        return age;
    }
}