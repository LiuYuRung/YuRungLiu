//IfImpl#foo()
//IfImpl#bar()
interface SpIf{
    void foo();
}
interface SubIf extends SpIf{
    void bar();
}
class IfImpl implements SubIf{
    public void foo(){
        System.out.println("IfImpl#foo()");
    }
    public void bar(){
        System.out.println("IfImpl#bar()");
    }
}
class SampleIfExtends01{
    public static void main(String[] args){
        IfImpl ii = new IfImpl();
        ii.foo();
        ii.bar();
    }
}