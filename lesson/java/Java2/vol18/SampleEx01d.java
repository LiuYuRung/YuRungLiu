//Exception in thread "main" java.lang.StackOverflowError
//        at Data.foo(SampleEx01d.java:3)...
class Data{
    void foo(){
        foo();//メソッド内で自分自身を呼び出している。
    }
}
class SampleEx01d{
    public static void main(String[] args){
        Data data = new Data();
        data.foo();
    }
}