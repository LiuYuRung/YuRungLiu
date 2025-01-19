class MyClass {
    String name = "XYZ" ;
    MyClass(String n) {
        name = n ;
    }
    static void foo() {
        System.out.println(name) ;
    }
}
class Vol09Test071702 {
    public static void main(String[] args) {
        MyClass mc = new MyClass("ABC") ;
        mc.foo() ;
    }
}