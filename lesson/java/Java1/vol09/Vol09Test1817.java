class A {
    String s = "Hello";
}
class B {
    A a = new A();
}
class C {
    B b = new B();
}
class Vol09Test1817{
    public static void main(String[] args){
        C c = new C();
        System.out.println(c.b.a.s);
    }
}