abstract class Zoo{
    void foo(){
        System.out.println("Zoo#foo()");
    }

    abstract void hoge();

    abstract void piyo();
}
abstract class SubZoo extends Zoo{
    void hoge(){
        System.out.println("SubZoo#hoge()");
    }
    abstract void piyo();
}

class MyZoo extends SubZoo{
    void piyo(){
        System.out.println("MyZoo#piyo()");
    }
}
class SampleAbstractClass02{
    public static void main(String[] args){
        MyZoo mz = new MyZoo();
        mz.foo();
        mz.hoge();
        mz.piyo();
    }
}