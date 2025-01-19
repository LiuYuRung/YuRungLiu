interface If{
    void foo(int x);
}
interface If2{
    void bar();
}
class IfImpl implements If1,If2{
    public void foo(int x){
        System.out.println("A");
    }
    public void bar(){
        System.out.println("B");
    }
}
class Vol17Test0541{
    public static void main(String[] args){
        new IfImpl().foo(1);
        new IfImpl().bar();
    }
}