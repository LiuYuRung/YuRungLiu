class Vol08Test0405{
    static int x = 10;

    static void foo1(){
        x *= 2;
        System.out.println(x);
    }
    static void foo2(int x){
        System.out.println(x);
    }
    public static void main(String[] args){
        foo1();
        foo2(x);
        foo2(x);
    }
}