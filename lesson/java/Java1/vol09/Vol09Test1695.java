class MyClass{
    int x;
    int y;
    MyClass(int x){
        this.x = x;
    }
    MyClass(int x, int y){
        this(x);
        this.y = y;
    }
}
class Vol09Test1695{
    public static void main(String[] args){
        MyClass mc1 = new MyClass(1,2);
        MyClass mc2 = new MyClass(4);
        System.out.println(mc1.x + mc1.y);
        System.out.println(mc2.x + mc2.y);
    }
}