class A{}
class B extends A{}
class C extends B{}
class Vol12Test0423{
    public static void main(String[] args){
        C c = new C();
        A a = (B)c;
    }
}