class Vol07Test1443{
    static void foo(long x){
        System.out.print("A");
    }
    static void foo(float x){
        System.out.print("B");
    }
    public static void main(String[] args){
        int x = 5;
        foo(x);
    }
}