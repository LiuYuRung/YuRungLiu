//A#foo()
class A{
    void foo(){
        System.out.println("A#foo()");
    }
}
class B extends A{
    void foo(){
        System.out.println("B#foo()");
    }
    void bar(){
        super.foo();
    }
}
class Vol12Test1856{
    public static void main(String[] args){
        B b = new B();
        b.bar();
    }
}