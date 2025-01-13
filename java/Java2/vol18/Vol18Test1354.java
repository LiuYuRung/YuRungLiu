class MyException extends Exception{}
Class Sp{
    void bar() throws Exception{
    }
}
class Sub extends Sp{
    void bar() throws MyException{
    }
}