class A{
    int x;
}
class B{
    A x = new A();
}
class C {
    B x = new B();
}
class Vol09Test1819{
    public static void main(String[] args){
        C x = new C();
        System.out.print(x.x.x.x);
    }
}