//IfImpl#foo()
interface If{
    void foo();
}
class IfImpl implements If{
    public void foo(){
        System.out.println("IfImpl#foo()");
    }
}
class SampleTypeRef01{
    public static void main(String[] args){
        If i;

        i = new IfImpl();

        i.foo();
    }
}