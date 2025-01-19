class MyClass{
    static int x;
    void bar(){
        x++;
    }
}
class Vol09Test1336{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        mc.bar();
        mc.bar();
        System.out.println(mc.x);
    }
}