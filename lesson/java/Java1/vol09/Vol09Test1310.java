class MyClass{
    int x;
    void foo(){
        System.out.println(x);
    }
    void bar(){
        x++;
    }
}
class Vol09Test1310{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        mc.foo();
        mc.bar();
        mc.foo();
    }
}