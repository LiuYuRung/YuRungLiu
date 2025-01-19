class Vol07Test2157{
    static void foo(int[] x){
        System.out.println("foo(int[])");
    }
    static void foo(int...x){
        System.out.println("foo(int...)");
    }
    public static void main(String[] args){
        foo(12);
    }
}