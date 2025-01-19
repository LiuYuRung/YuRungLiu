//Sp#foo()
//Sub#foo(int)
class Sp{
    void foo(){
        System.out.println("Sp#foo()");
    }
}
class Sub extends Sp{
    void foo(int i){
        System.out.println("Sub#foo(int)");
    }
}
class SampleOverload01{
    public static void main(String[] args){
        Sub sb = new Sub();
        sb.foo();
        sb.foo(2);
    }
}