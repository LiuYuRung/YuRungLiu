class MyClass {
    int x ;
    MyClass(int x) {
        x = x ;
    }
    MyClass() {
        this(10) ;
    }
}
class Vol09Test071703 {
    public static void main(String[] args) {
        MyClass mc = new MyClass() ;
        System.out.print(mc.x) ;
    }
}