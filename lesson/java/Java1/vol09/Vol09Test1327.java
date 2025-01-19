class MyClassA{
    MyClassB mcb;
    MyClassA(MyClassB _mcb){
        mcb = _mcb;
    }
    void foo(){
        System.out.println(mcb.x + ":" + mcb.y);
    }
}
class MyClassB{
    int x = 10;
    int y;
}
class Vol09Test1327{
    public static void main(String[] args){
        MyClassB mcb = new MyClassB();
        MyClassA mca = new MyClassA(mcb);
        mca.foo();
    }
}