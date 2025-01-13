interface If{
    void foo();
    void bar();
}

class IfImpl implements If{
    public void foo(){
        System.out.println("IfImpl#foo()");
    }
    public void bar(){
        System.out.println("IfImpl#bar()");
    }
}
class SampleIfImpliment01{
    public static void main(String[] args){
        IfImpl ii = new IfImpl();
        ii.foo();
        ii.bar();
    }
}