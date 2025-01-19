class Vol07Test1473{
    static void foo(int x ){
        System.out.print("A");
    }
    static void foo(int x, int y){
        System.out.print("B");
    }
    static void foo(int x, int y, int z ){
        System.out.print("C");
    }
    public static void main(String[] args){
        byte b = 10;
        int i = 10;
        foo(i,i);
        foo(b);
    }
}