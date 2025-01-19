class A{}
class B extends A{}
class C extends A{}
class Vol12Test0419{
    public static void main(String[] args){
        B b = new B();
        C c = new C();
        b = c;
    }
}