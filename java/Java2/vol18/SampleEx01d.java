//Exception in thread "main" java.lang.StackOverflowError
//        at Data.foo(SampleEx01d.java:3)...
class Data{
    void foo(){
        foo();//���\�b�h���Ŏ������g���Ăяo���Ă���B
    }
}
class SampleEx01d{
    public static void main(String[] args){
        Data data = new Data();
        data.foo();
    }
}