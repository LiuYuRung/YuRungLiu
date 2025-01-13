//IfImpl#foo()
//IfImpl#bar()
//IfImpl#hogr()
interface SpIf1{
    void foo();
}
interface SpIf2{
    void bar();
}
interface SubIf extends SpIf1,SpIf2{
    void hoge();
}
class IfImpl implements SubIf{
    public void foo(){
        System.out.println("IfImpl#foo()");
    }
    public void bar(){
        System.out.println("IfImpl#bar()");
    }
    public void hoge(){
        System.out.println("IfImpl#hogr()");
    }
}
class SampleIfExtends03{
    public static void main(String[] args){
        IfImpl ii = new IfImpl();
        ii.foo();
        ii.bar();
        ii.hoge();
    }
}