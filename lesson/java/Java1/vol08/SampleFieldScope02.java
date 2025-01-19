class SampleFieldScope02{
    static int x = 10;
    static void foo(){
        x *= 2;
    }
    public static void main(String[] args){
        foo();
        System.out.println(x);
    }
}