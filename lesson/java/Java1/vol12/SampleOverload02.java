//Sp#foo()
//SubSub#foo(int)
class Sp{
    void foo(){
        System.out.println("Sp#foo()");
    }
}
class Sub extends Sp{}
class SubSub extends Sub{
    void foo(int i){
        System.out.println("SubSub#foo(int)");
    }
}
class SampleOverload02{
    public static void main(String[] args){
        SubSub sb = new SubSub();
        sb.foo();
        sb.foo(2);
    }
}