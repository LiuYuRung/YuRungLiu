interface If{
    public static void foo(){
        System.out.println("A");
    }
}
class IfImpl implements If{
}
class Vol17Test0554{
    public static void main(String[] args){
        IfImpl.foo();
    }
}