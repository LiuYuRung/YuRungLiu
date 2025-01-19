//IfImpl1#foo()
//IfImpl2#foo()
interface If{
    void foo();
}
class IfImpl1 implements If{
    public void foo(){
        System.out.println("IfImpl1#foo()");
    }
}
class IfImpl2 implements If{
    public void foo(){
        System.out.println("IfImpl2#foo()");
    }
}
class SampleTypeRef02{
    public static void main(String[] args){
        If i;

        i = new IfImpl1();
        i.foo();

        i = new IfImpl2();
        i.foo();
    }
}