//If#foo
interface If{
    public default void foo(){
        System.out.println("If#foo");
    }
}
class MyClass implements If{
}
class Vol17Test0446{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        mc.foo();
    }
}