interface If{
    int x = 1;
}
class IfImpl implements If{
    static int x = 2;
}
class Vol17Test0523{
    public static void main(String[] args){
        System.out.println(IfImpl.x);
        System.out.println(If.x);
    }
}