class MyClassA{
    int num = 100;
}
class MyClassB{
    MyClassA a;
    MyClassB(MyClassA a){
        this.a = a;
    }
}
class Vol09Test1762{
    public static void main(String[] args){
        MyClassA a = new MyClassA();

        MyClassB b = new MyClassB(a);

        System.out.println(b.a.num);
    }
}