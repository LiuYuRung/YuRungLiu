class Vol07Test2149{
    static void foo(long x1, long x2){
        System.out.println("foo(long, long)");
    }
    static void foo(long...x){
        System.out.println("foo(long...)");
    }
    public static void main(String[] args){
        int i1 = 10, i2 = 20, i3 = 30;
        foo(i1);
        foo(i1, i2);
        foo(i1,i2,i3);
    }
}