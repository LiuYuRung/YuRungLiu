class MyClassA{
    int x;
    int y;
    MyClassA(int x, int y){
        this.x = x;
        this.y = y;
    }
    MyClassA(){
        this(10,20);
    }
}
class MyClassB{
    MyClassA a;
    int foo(){
        int x = a.x + a.y;
        return x;
    }
}
class Vol09Test1811{
    public static void main(String[] args){
        MyClassB b = new MyClassB();
        System.out.print(b.foo());
    }
}