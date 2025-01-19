class MyClass {
    int x = 1 ;
    int y = 1 ;
    MyClass() {
        this(10, 20) ;
    }
    MyClass(int a) {
        this(a, 200)  ;
    }
    void MyClass(int a, int b) {
        this.x = a ;
        this.y = b ;
    }
}
class Vol09Test071704{
    public static void main(String[] args) {
        int a = 100, b = 200 ;
        MyClass mc1 = new MyClass() ;
        MyClass mc2 = new MyClass(a, b) ;
        System.out.print((mc1.x + mc1.y) + ":" + (mc2.x + mc2.y)) ;
    }
}