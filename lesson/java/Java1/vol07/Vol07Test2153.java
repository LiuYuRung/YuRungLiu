class Vol07Test2153{
    static void foo(int x){
        System.out.println("foo(int)");
    }
    static void foo(int...x){
        System.out.println("foo(int...)");
    }
    public static void main(String[] args){
        foo(12);
    }
}