//MyClass#foo()
class MyException extends Exception{}
class MyClass{
    void foo() throws MyException{
        System.out.println("MyClass#foo()");
        //MyException‚ª¶‚¶‚é‰Â”\«‚Ì‚ ‚éˆ—
    }
}

class SampleMyEx01{
    public static void main(String[] args){
        try{
            MyClass mc = new MyClass();
            mc.foo();
        }catch(MyException e){
            System.out.println("MyException‚ª¶‚¶‚Ü‚µ‚½B");
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}