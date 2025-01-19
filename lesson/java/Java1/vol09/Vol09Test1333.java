class MyClass{
    static int x;
}
class Vol09Test1333{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        mc.x = 10;
        MyClass.x = 20;
        System.out.println(mc.x);
    }
}