class MyClass{
    int[] a;
    void foo() {
        System.out.println(a[0]);
    }
}
class Vol09Test1315{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        mc.a = new int[3];
        mc.foo();
        mc.a[0] = 10;
        mc.foo();
    }
}