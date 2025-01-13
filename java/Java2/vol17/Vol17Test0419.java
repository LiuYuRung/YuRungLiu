//If1#foo
//If2#foo
interface If1{
    public static void foo(){
        System.out.println("If1#foo");
    }
}
interface If2{
    public static void foo(){
        System.out.println("If2#foo");
    }
}
class MyClass implements If1, If2{
}
public class Vol17Test0419{
    public static void main(String[] args){
        If1.foo();        //OK
        If2.foo();        //OK
        //MyClass.foo();  //コンパイルエラー
    }
}