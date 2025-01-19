class A{}
class B extends A{}
class C extends A{}
class Vol12Test0416{
    public static void main(String[] args){
        A a1 = new B();
        A a2 = new C();
        a1 = a2;
    }
}