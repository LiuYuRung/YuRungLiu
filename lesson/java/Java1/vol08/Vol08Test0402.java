class Vol08Test0402{
    static int x = 10;
    
    static void foo(int x){
        System.out.println(2 * x);
    }
    static void bar(int x){
        System.out.println(3 * x);
    }
    public static void main(String[] args){
        foo(x);
        bar(x);
    }
}