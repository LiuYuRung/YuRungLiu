interface If{
    int x = 1;
}
class IfImpl implements If{
    int x = 10;
}
class Vol17Test0534{
    public static void main(String[] args){
        IfImpl i = new IfImpl();
        System.out.println(i.x);
    } 
}