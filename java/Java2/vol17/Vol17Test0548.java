interface If{
    public void foo(){
        System.out.println("A");
    }
}
class IfImpl implements If{
}
class Vol17Test0548{
    public static void main(String[] args){
        new IfImpl().foo();
    }
}