interface If1{
    void foo();
}
interface If2{
    void bar();
}
class IfImpl implements If1, If2{
    public void foo(){
        System.out.println("IfImpl#foo()");
    }
    public void bar(){
        System.out.println("IfImpl#bar()");
    }
}
class SampleIfImpliment03{
    public static void main(String[] args){
        IfImpl ii = new IfImpl();
        ii.foo();
        ii.bar();
    }
}