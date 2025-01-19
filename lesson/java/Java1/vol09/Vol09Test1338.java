class MyClass{
    static int x;
    static void bar(){
        x++;
    }
    int foo(){
        return 10 * x;
    }
}
class Vol09Test1338{
    public static void main(String[] args){
        MyClass.bar();
        MyClass mc = new MyClass();
        System.out.println(mc.foo());
    }
}