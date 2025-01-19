interface If{
    int X = 10;
    void foo();
}
class IfImpl implements If{
    public void foo(){
        System.out.println(X);
    }
}
class SampleIfImpliment04{
    public static void main(String[] args){
        IfImpl ii = new IfImpl();
        ii.foo();
    }
}