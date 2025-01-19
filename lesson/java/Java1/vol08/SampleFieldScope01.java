class SampleFieldScope01{
    static int x = 10;

    static void foo(){
        System.out.println(x);
    }

    public static void main(String[] args){
        foo();
        System.out.println(x);
    }
}