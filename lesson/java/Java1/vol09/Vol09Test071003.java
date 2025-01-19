class MyClassA{
    int x = 5;
}
class MyClassB{
    int x = 1;
    MyClassB(int y){
        x = y;
    }
}
class Vol09Test071003{
    public static void main(String[] args){
        MyClassA mca = new MyClassA();
        MyClassB mcb = new MyClassB(5);
        mcb = mca;
        System.out.print(mcb.x);
    }
}