interface If{
    int x = 1;
    int foo(int x);
}
class IfImpl implements If{
    public void foo(){
        System.out.println(x);
    }
}
class Vol17Test0530{
    public static void main(String[] args){
        IfImpl i = new IfImpl();
        i.foo();
    }
}