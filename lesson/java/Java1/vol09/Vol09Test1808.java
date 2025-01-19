class MyClassA{
    int x;
    int y;
}
class MyClassB{
    MyClassA a;
    MyClassB(MyClassA a){
        this.a = a;
    }
    int foo() {
        int x = a.x + a.y;
        return x;
    }
}
class Vol09Test1808{
    public static void main(String[] args){
        MyClassA a = new MyClassA();
        a.x = 20;
        a.y = 50;
        MyClassB b = new MyClassB(a);
        System.out.print(b.foo());
    }
}