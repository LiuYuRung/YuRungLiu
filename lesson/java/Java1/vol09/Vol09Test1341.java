class MyClass{
    static int x = 10;
    int y = 20;
    MyClass(int _y){
        y = _y;
    }
    void foo(){
        System.out.println(y);
    }
}
class Vol09Test1341{
    public static void main(String[] args){
        MyClass mc = null;
        System.out.println(mc.x);
        mc = new MyClass(30);
        System.out.println(mc.y);
    }
}