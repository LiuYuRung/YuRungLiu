//10
class A{
    int x = 10;
}
class B extends A{
    int x = 20;

    void foo(){
        System.out.println(super.x);
    } 
}
class Vol12Test1900{
    public static void main(String[] args){
        B b = new B();
        b.foo();
    }
}