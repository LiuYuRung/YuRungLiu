class A{}
class B extends A{}
class C extends B{}
class Vol12Test0421{
    public static void main(String[] args){
        A a = new C();
        A b = (B)a;
    }
}