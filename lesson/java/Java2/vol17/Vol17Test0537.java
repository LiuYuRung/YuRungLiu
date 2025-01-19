interface If{
    int x = 1;
    void foo();
}
class IfImpl implements If{
    public void foo(){
        x = 10;
        System.out.println(x);
    }
}
class Vol17Test0537{
    public static void main(String[] args){
        new IfImpl().foo();
    }
}