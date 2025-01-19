class Vol07Test1453{
    static void foo(char x){
        System.out.print("A");
    }
    static void foo(int x){
        System.out.print("B");
    }
    static void foo(double x ){
        System.out.print("C");
    }
    public static void main(String[] args){
        double d = 2.3D;
        foo((short)d);
    }
}