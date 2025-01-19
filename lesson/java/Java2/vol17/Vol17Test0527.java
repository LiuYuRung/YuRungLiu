interface If{
    int x = 1;
}
class IfImpl implements If{
    public void foo(){
        System.out.println(x);
    }
}
class Vol17Test0527{
    public static void main(String[] args){
        IfImpl i = new IfImpl();
        i.foo();
    }
}