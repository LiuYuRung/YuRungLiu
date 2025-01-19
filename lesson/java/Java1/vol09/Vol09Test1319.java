class MyClassA{
    int x = 1;
    int y = 2;
}
class MyClassB{
    void foo(MyClassA mca){
        System.out.println(mca.x + ":" + mca.y);
    }
}
class Vol09Test1319{
    public static void main(String[] args){
        MyClassA mca = new MyClassA();
        MyClassB mcb = new MyClassB();
        mcb.foo(mca);
    }
}