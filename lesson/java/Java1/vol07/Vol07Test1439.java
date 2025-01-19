class Vol07Test1439{
    static void foo(float x){
        System.out.print("A");
    }
    static void foo(short x){
        System.out.print("B");
    }
    public static void main(String[] args){
        byte b = 5;
        foo(b);
    }
}