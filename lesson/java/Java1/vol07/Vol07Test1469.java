class Vol07Test1469{
    static void foo(int[] x){
        System.out.print("A");
    }
    static void foo(int x){
        System.out.print("B");
    }
    static void foo(int x, int y){
        System.out.print("C");
    }
    public static void main(String[] args){
        int[] x = {10, 20 , 30};
        foo(x[1],x[2]);
    }
}