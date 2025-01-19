abstract class Ab{
    abstract void method();
}
abstract class AbSub extends Ab{}
class MyClass extends AbSub{
    void method(){
        System.out.println("A");
    }
}
class Vol16Test0250{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        mc.method();
    }
}