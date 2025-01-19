class Vol07Test1491{
    static void foo(int x){
        System.out.println("foo(int)");
    }
    static void foo(double d){
        System.out.println("foo(double)");
    }
    public static void main(String[] args){
        float f = 7.7f;
        foo(f);
    }
}