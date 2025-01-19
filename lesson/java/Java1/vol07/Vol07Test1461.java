class Vol07Test1461{
    static void foo(String[] x){
        System.out.print("A");
    }
    static void foo(String x){
        System.out.print("B");
    }
    public static void main(String[] args){
        String x ="XYZ";
        foo(x);
    }
}