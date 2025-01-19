class Sp{
    int x = 10;
    void foo(){
        System.out.println("Sp#foo()");
    }
}
class Sub extends Sp{
    int y = 20;
    void bar(){
        System.out.println("Sub#bar()");
    }
}
class SubSub extends Sub{
    int z = 30;
    void hoge(){
        System.out.println("SubSub#hoge()");
    }
}
class SampleSubInstance03{
    public static void main(String[] args){
        new SubSub();
    }
}