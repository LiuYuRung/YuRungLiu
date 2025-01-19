class MyClass{
    MyClass(short x){
        System.out.println("MyClass(short)");
    }
    MyClass(int x){
        System.out.println("MyClass(int)");
    }
    MyClass(long x){
        System.out.println("MyClass(long)");
    }
    MyClass(double x){
        System.out.println("MyClass(double)");
    }
}
class Vol09Test0594{
    public static void main(String[] args){
        byte b = 1;
        short s = 1;
        int i = 1;
        long x = 1;
        float f = 1;
        double d = 1;
        char c = 'A';
        new MyClass(b);
        new MyClass(s);
        new MyClass(i);
        new MyClass(x);
        new MyClass(f);
        new MyClass(d);
        new MyClass(c);
    }


}