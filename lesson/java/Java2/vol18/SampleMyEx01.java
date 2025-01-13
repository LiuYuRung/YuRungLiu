//MyClass#foo()
class MyException extends Exception{}
class MyClass{
    void foo() throws MyException{
        System.out.println("MyClass#foo()");
        //MyExceptionが生じる可能性のある処理
    }
}

class SampleMyEx01{
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