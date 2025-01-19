//B#foo()
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
        foo();
    }
}
class Vol12Test1830{
    public static void main(String[] args){
        B b = new B();
        b.bar();
    }
}