//IfImpl#foo()
//IfImpl#bar()
interface SpIf1{
    void foo();
}
interface SpIf2{
    void bar();
}
interface SubIf extends SpIf1, SpIf2{
}
class IfImpl implements SubIf{
    public void foo(){
        System.out.println("IfImpl#foo()");
    }
    public void bar(){
        System.out.println("IfImpl#bar()");
    }
}
class SampleIfExtends02{
    public static void main(String[] args){
        IfImpl ii = new IfImpl();
        ii.foo();
        ii.bar();
    }
}