class MyClassA{
    int x = 1;
    int y = 2;
}
class MyClassB{
    void foo(MyClassA mca){
        System.out.println(mca.x + ":" + mca.y);
    }
}
class Vol09Test1322{
    public static void main(String[] args){
        MyClassA mca = new MyClassA();
        MyClassB mcb = new MyClassB();
        mca.x *= 5;
        mca.y *= 5;
        mcb.foo(mca);
    }
}