class Vol07Test1449{
    static void foo(int x, int y){
        System.out.print("A");
    }
    static void foo(int a, int b){
        System.out.print("B");
    }
    public static void main(String[] args){
        int v = 5, w = 10;
        foo(v,w);
    }
}