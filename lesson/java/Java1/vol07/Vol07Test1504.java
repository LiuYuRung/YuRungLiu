class Vol07Test1504{
    static void foo(int[] x){
        System.out.println("foo(int[])");
    }
    static void foo(byte[] b){
        System.out.println("foo(byte[])");
    }
    public static void main(String[] args){
        short[] s = {10,20,30};
        foo(s);
    }
}