abstract class Ab{
    abstract void method();
}
class MyClass extends Ab{
    void method(){
        System.out.println("A");
    }
}
class Vol16Test0241{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        mc.method();
    }
}