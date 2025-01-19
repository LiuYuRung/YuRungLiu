class SampleFieldScope03{
    static int x = 10;
    static void foo(){
        int x = 777;
        System.out.println(x);
    }
    public static void main(String[] args){
        foo();
    }
}