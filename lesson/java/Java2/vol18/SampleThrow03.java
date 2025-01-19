//MyException
//        at MyClassA.foo(SampleThrow03.java:4)
//        at MyClassB.bar(SampleThrow03.java:11)
//        at SampleThrow03.main(SampleThrow03.java:21)
class MyException extends Exception{}
class MyClassA{
    void foo() throws MyException{
        throw new MyException();
    }
}
class MyClassB{
    void bar() throws MyException{
        try{
            MyClassA mca = new MyClassA();
            mca.foo();
        }catch(MyException e){
            throw e;
        }
    }
}
class SampleThrow03{
    public static void main(String[] args){
        try{
            MyClassB mcb = new MyClassB();
            mcb.bar();
        }catch(MyException e){
            e.printStackTrace();
        }
    }
}