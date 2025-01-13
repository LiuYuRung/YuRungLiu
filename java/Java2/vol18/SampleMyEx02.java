//MyClass#foo()
//MyExceptionが生じました。
//MyException: MyExceptionが生じました。
//        at MyClass.foo(SampleMyEx02.java:10)
//        at SampleMyEx02.main(SampleMyEx02.java:17)
class MyException extends Exception{
    MyException(){
        super("MyExceptionが生じました。");
    }
}

class MyClass{
    void foo()throws MyException{
        System.out.println("MyClass#foo()");
        throw new MyException();
    }
}
class SampleMyEx02{
    public static void main(String[] args){
        try{
            MyClass mc = new MyClass();
            mc.foo();
        }catch(MyException e){
            System.out.println("MyExceptionが生じました。");
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}