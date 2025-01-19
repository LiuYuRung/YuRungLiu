//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//        at SampleEx02.foo(SampleEx02.java:4)
//        at SampleEx02.main(SampleEx02.java:8)
class SampleEx02{
    int[] a = {10, 20, 30};
    void foo(){
        a[3] = 0;
    }
    public static void main(String[] args){
        SampleEx02 s = new SampleEx02();
        s.foo();
    }
}