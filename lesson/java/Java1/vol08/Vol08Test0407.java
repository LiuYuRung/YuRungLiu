class Vol08Test0407{
    static int i = 7;
    static void foo(){
        i *= 2;
        System.out.println(i);
    }
    public static void main(String[] args){
        System.out.println(i);
        foo();
        System.out.println(i);
    }
}