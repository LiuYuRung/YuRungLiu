class MyClassA{
    int x;
    MyClassA(int x){
        this.x = x;
    }
}
class MyClassB {
    MyClassA a;
    MyClassB(MyClassA a){
        this.a = a;
    }
}
class Vol09Test1814{
    public static void main(String[] args){
        MyClassA a = new MyClassA(100);
        MyClassB b1 = new MyClassB(a);
        MyClassB b2 = new MyClassB(a);
        b2.a.x = 7;
        System.out.println(b1.a.x);
        System.out.println(b2.a.x);        
    }
}