class MyClass{
    void foo(){
        System.out.println("A");
    }
}
class Vol09Test1324{
    public static void main(String[] args){
        new MyClass().foo();
        (new MyClass()).foo();
    }
}