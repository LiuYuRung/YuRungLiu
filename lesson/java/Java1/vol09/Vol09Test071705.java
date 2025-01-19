class MyClass {
    int x = 10 ;
    static int y = 20 ;
    String foo() {
       return x + ":" + this.y ;
    }
}
class Vol09Test071705 {
    public static void main(String[] args) {
        MyClass mc1 = new MyClass() ;
        mc1.y = 30 ;
        System.out.println(mc1.foo()) ;
        MyClass mc2 = new MyClass() ;
        mc2.x = 20 ;
        System.out.println(mc2.foo()) ;
    }
}