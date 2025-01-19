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
class UseZoo{
    void useHoge(Zoo z){
        z.hoge();
    }
}
class SampleAbsType02{
    public static void main(String[] args){
        UseZoo uz = new UseZoo();
        uz.useHoge(new MyZoo2());
    }
}