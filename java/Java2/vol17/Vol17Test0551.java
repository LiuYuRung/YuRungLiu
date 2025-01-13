interface If{
    public default void foo(){
        System.out.println("A");
    }
}
class IfImpl implements If{
}
class Vol17Test0551{
    public static void main(String[] args){
        new IfImpl().foo();
    }
}