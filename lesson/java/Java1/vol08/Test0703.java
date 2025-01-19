class Test0703{
    static int[] x = new int[3];
    static int[] foo(int a, int b){
        x[a] = b;
        return x;
    }
    public static void main(String[] args){
        int a = 1,b = 2;
        int[] x = foo(a,b);
        System.out.println(x[0] + x[1] + x[2]);
    }
}