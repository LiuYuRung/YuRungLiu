//Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at SampleEx01a.main(SampleEx01a.java:6)
class SampleEx01a{
    public static void main(String[] args){
        int a = 5;
        int b = 0;

        int result = a / b; //int�l0�ɂ�銄��Z�B���s����O��������

        System.out.println(result);
    }
}