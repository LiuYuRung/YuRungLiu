class MyClass{
    int[] a = new int[3];
    void foo(){
        System.out.println(a[0]);
    }
}
class Vol09Test1317{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        mc.foo();
    }
}