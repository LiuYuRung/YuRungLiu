//IfImpl#foo()
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
class SampleTypeRef03{
    public static void main(String[] args){
        SpIf spi = new IfImpl();

        spi.foo();
        //spi.bar();

        SubIf sbi = new IfImpl();

        sbi.foo();
        sbi.bar();
    }
}