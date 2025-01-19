abstract class Ab{
    abstract void method();
}
abstract class AbSub extends Ab{
    public abstract void method();
}
class MyClass extends AbSub{
    void method(){
        System.out.println("A");
    }
}
class Vol16Test0255{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        mc.method();
    }
}