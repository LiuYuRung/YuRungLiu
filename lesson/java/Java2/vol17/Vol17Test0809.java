//SubIf#foo
interface SpIf{
    public default void foo(){
        System.out.println("SpIf#foo");
    }
}
interface SubIf extends SpIf{
    public default void foo(){
        System.out.println("SubIf#foo");
    }
}
class MyClass implements SubIf{
}
class Vol17Test0809{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        mc.foo();
    }
}