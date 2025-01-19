class Vol07Test1153{
    static void foo(int x){
        x = x * 100;
    }
    public static void main(String[] args){
        int x = 12;
        foo(x);
        System.out.println(x);
    }
}