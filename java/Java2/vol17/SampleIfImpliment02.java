interface If{
    void foo();
    void bar();
}
abstract class IfAb implements If {
    public void foo(){
        System.out.println("IfAb#foo()");
    }
    public abstract void bar();
}
class IfImpl extends IfAb{
    public void bar(){
        System.out.println("IfImpl#bar");
    }
}

class SampleIfImpliment02{
    public static void main(String[] args){
        IfImpl ii = new IfImpl();
        ii.foo();
        ii.bar();
    }
}