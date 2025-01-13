interface If1{
    void foo();
}
interface If2{
    void foo();
}
class IfImpl implements If1,If2{
    public void foo(){
        System.out.println("A");
    }
    public void bar(){
        System.out.println("B");
    }
}
class Vol17Test0545{
    public static void main(String[] args){
        new IfImpl().foo();
        new IfImpl().bar();
    }
}