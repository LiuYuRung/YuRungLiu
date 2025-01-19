abstract class Zoo{
    void foo(){
        System.out.println("Zoo#foo()");
    }
    abstract void hoge();
}
class MyZoo1 extends Zoo{
    void hoge(){
        System.out.println("MyZoo1#hoge()");
    }
}
class MyZoo2 extends Zoo{
    void hoge(){
        System.out.println("MyZoo2#hoge()");
    }
}
class SampleAbsType01{
    public static void main(String[] args){
        Zoo z;

        z = new MyZoo1();
        z.foo();
        z.hoge();

        z = new MyZoo2();
        z.foo();
        z.hoge();
    } 
}