//Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at SampleEx01a.main(SampleEx01a.java:6)
class SampleEx01a{
    public static void main(String[] args){
        int a = 5;
        int b = 0;

        int result = a / b; //int値0による割り算。実行時例外が生じる

        System.out.println(result);
    }
}