class MyClass{
    int x;
}
class Vol09Test1303{
    public static void main(String[] args){
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        mc1.x = 1;
        mc2.x = 3;
        System.out.println(mc1.x);
        System.out.println(mc2.x);
    }
}