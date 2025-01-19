class Vol08Test0395{
    static int x = 0;

    static void foo(){
        int y = 0;
        x++;
        y++;
        System.out.println(x + ":" + y);
    }
    public static void main(String[] args){
        foo();
        foo();
        foo();
    }
}