//MyClass#foo()
//MyException
//        at MyClass.foo(SampleThrow01.java:6)
//        at SampleThrow01.main(SampleThrow01.java:13)
class MyException extends Exception{}

class MyClass{
    void foo() throws MyException{
        System.out.println("MyClass#foo()");
        throw new MyException();
    }
}
class SampleThrow01{
    public static void main(String[] args){
        try{
            MyClass mc = new MyClass();
            mc.foo();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}