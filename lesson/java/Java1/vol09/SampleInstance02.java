class Person2{
    String name;
    int age;

    Person2(String _name, int _age){
        name = _name;  //フィールドnameへ代入
        age = _age;    //フォールドageへ代入
        System.out.println(name +"," + age);
    }
}
class SampleInstance02{
    public static void mian(String[] args){
        new Person2("Tanka", 23);
    }
}