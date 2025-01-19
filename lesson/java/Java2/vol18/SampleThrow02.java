//MyException
//        at SampleThrow02.main(SampleThrow02.java:5)
class MyException extends Exception{}
class SampleThrow02{
    public static void main(String[] args){
        try{
            throw new MyException();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}