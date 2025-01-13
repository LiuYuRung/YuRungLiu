//MyClass#foo
interface If{
    public default void foo(){
        System.out.println("If1#foo");
    }
}
class MyClass implements If{
    public void foo(){
        System.out.println("MyClass#foo");
    }
}
class Vol17Test0490{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        mc.foo();
    }
}