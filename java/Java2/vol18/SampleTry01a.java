//Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at SampleTry01a.main(SampleTry01a.java:6)
class SampleTry01a{
    public static void main(String[] args){
        int a = 5;
        int b = 0;

        int result = a / b;

        System.out.println("a / b = " + result);

        System.out.println("プログラムの終わりです。");
    }
}