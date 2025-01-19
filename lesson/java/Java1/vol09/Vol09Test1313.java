class MyClass{
    int x = 3;
    void foo(){
        x *= 2;
    }
    void bar(){
        x++;
    }
    void hoge(){
        bar();
    }
}
class Vol09Test1313{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        mc.hoge();
        mc.foo();
        System.out.println(mc.x);
    }
}