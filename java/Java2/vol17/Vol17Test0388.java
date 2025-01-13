//If#foo
//MyClass#foo
interface If{
    public static void foo(){
        System.out.println("If#foo");
    }
}
class MyClass implements If{
    public static void foo(){
        System.out.println("MyClass#foo");
    }
}
public class Vol17Test0388{
    public static void main(String[] args){
        If.foo();      //OK
        MyClass.foo(); //OK
    }
}