interface If{
    public static void foo(){
        System.out.println("static method: If#foo");
    }
}
class MyClass implements If{
}
public class Vol17Test0366{
    public static void main(String[] args){
        If.foo();        //OK
        //MyClass.foo(); //コンパイルエラー
    }
}