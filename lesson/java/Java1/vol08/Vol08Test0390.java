class Vol08Test0390{
    static int x = 10;
    static void foo(){
        x = 30;
    }
    public static void main(String[] args){
        foo();
        System.out.println(x);
    }
}