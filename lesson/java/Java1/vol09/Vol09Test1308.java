class MyClass{
    int x;
    void foo(){
        System.out.println(x);
    }
}
class Vol09Test1308{
    public static void main(String[] args){
        MyClass mc =new MyClass();
        mc.x = 1;
        mc.foo(); 
    }
}