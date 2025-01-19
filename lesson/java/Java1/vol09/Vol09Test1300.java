class MyClass{
    int x;
    int foo(){
        return x;
    }
}
class Vol09Test1300{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        mc.x = 100;
        int x = mc.foo();
        System.out.println(x);
    }
}