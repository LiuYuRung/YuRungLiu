class Vol07Test1457{
    static void foo(int[] x){
        System.out.print("A");
    }
    static void foo(float[] x){
        System.out.print("B");
    }
    public static void main(String[] args){
        byte[] x = new byte[10];
        foo(x);
    }
}