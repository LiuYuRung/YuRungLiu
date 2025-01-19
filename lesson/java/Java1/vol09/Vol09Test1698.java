class MyClass{
    int x;
    int y;
    MyClass(int _x){
        x = _x;
    }
    MyClass(int _x, int _y){
        y = _y;
        this(_x);
    }
}
class Vol09Test1698{
    public static void main(String[] args){
        MyClass mc1 = new MyClass(1,2);
        MyClass mc2 = new MyClass(4);
        System.out.println(mc1.x + mc1.y);
        System.out.println(mc2.x + mc2.y);
    }
}