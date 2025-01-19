class SampleMethodLocal03a{
    static int foo(int x){
        x = x * 10;
        return x;
    }
    public static void main(String[] args){
        int x = 12;
        x = foo(x);
        System.out.println(x);
    }
}