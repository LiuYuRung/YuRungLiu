//MyClass#foo()
class MyException extends Exception{}
class MyClass{
    void foo() throws MyException{
        System.out.println("MyClass#foo()");
        //MyException��������\���̂��鏈��
    }
}

class SampleMyEx01{
    public static void main(String[] args){
        try{
            MyClass mc = new MyClass();
            mc.foo();
        }catch(MyException e){
            System.out.println("MyException�������܂����B");
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}