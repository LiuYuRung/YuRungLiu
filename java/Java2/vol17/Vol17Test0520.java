interface If{
    void foo();
}
class IfImpl implements If{
    public void foo(){
        System.out.print("A");
    }
}
class Vol17Test0520{
    public static void main(String[] args){
        IfImpl i = new IfImpl();
        i.foo();
    }
}