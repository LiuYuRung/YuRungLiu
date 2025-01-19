abstract class Zoo{
    void foo(){
        System.out.println("zoo#foo()");
    }

    abstract void hoge();

    abstract void piyo();
}

class MyZoo extends Zoo{
    void hoge(){
        System.out.println("MyZoo#hoge()");
    }
    void piyo(){
        System.out.println("MyZoo#piyo()");
    }
}
class SampleAbstractClass01{
    public static void main(String[] args){
        MyZoo mz = new MyZoo();
        mz.foo();
        mz.hoge();
        mz.piyo();
    }
}