class MyClass{
    int x;
    int y;
    MyClass(int x, int y){
        this.x = x;
        this.y = y;
    }
    MyClass(int x){
        this();
    }
}
class Vol09Test1700{
    public static void main(String[] args){
        MyClass mc = new MyClass(4);
    }
}