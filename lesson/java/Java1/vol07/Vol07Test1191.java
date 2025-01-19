class Vol07Test1191{
    static void foo(void){
        System.out.print("A");
    }
    static void bar(short x ){
        foo();
        System.out.println("B");
    }
    public static void main(String[] args){
        short s = 1;
        foo();
        bar(s);
    }
}