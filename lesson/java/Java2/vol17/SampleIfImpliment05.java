//Sub#foo()
//Sp#bar()
interface If{
    void foo();
}
class Sp{
    public void bar(){
        System.out.println("Sp#bar()");
    }
}
class Sub extends Sp implements If{
    public void foo(){
        System.out.println("Sub#foo()");
    }
}
class SampleIfImpliment05{
    public static void main(String[] args){
        Sub sb = new Sub();
        sb.foo();
        sb.bar();
    }
}