class Vol08Test0392{
    static int x = 10;
    static void foo(int x){
        x = 30;
        System.out.println(x);
    }
    public static void main(String[] args){
        int y = 3;
        foo(y);
        System.out.println(x);
    }
}