//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//        at SampleEx01b.main(SampleEx01b.java:5)
class SampleEx01b{
    public static void main(String[] args){
        int[] a = {10, 20 ,30};

        System.out.println(a[3]); //存在しない配列要素にアクセス
    }
}