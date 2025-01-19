class MyClass{
    int x = 10;
    MyClass(){
        x += 1;
    }
    void foo(int a){
        x += a;
    }
}
class Vol09Test071001{
    public static void main(String[] args){
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        mc1 = mc2;
        mc2.foo(0);
        System.out.print(mc1.x);
    }
}