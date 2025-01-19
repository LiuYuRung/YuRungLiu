class MyClass{
    static int x;
    int v;

    void bar(){
        System.out.println("x = " + x + ", v = " + v);
    }
}
class SampleMember01{
    public static void main(String[] args){
        MyClass mc1 = new MyClass();
        mc1.x = 1;
        mc1.v = 2;

        mc1.bar();
        System.out.println(MyClass.x);

        MyClass mc2 = new MyClass();
        mc2.x = -1;
        mc2.v = -2;

        mc1.bar();
        mc2.bar();
        System.out.println(MyClass.x);
    }
}