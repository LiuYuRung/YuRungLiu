class MyClass{
    int x;
    MyClass(int _x){
        x = _x;
    }
    void foo(){
        System.out.println(x);
    }
}
class Vol09Test1329{
    public static void main(String[] args){
        new MyClass(12).foo();
    }
}