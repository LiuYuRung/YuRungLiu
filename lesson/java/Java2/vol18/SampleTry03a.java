//java.lang.ArithmeticException: / by zero
//        at SampleThrows03a.main(SampleThrows03a.java:10)
class SampleTry03a{
    public static void main(String[] args){
        int a, b, result;
        try{
            a = 5;
            b = 0;

            result = a / b;

            System.out.println("a / b = " + result);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}