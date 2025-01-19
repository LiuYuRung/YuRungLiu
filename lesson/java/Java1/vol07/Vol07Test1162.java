class Vol07Test1162{
    static void bar(){
        System.out.println("A");
    }
    static void foo(){
        bar();
        System.out.println("B");
    }
    public static void main(String[] args){
        foo();
        bar();
    }
}