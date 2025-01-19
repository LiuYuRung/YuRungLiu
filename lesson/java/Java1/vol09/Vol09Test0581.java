class MyClass{
    MyClass(String s, int...x){
        System.out.print("A");
    }
}
class Vol09Test0581{
    public static void main(String[] args){
        new MyClass("hello");
        new MyClass("hello",11);
        new MyClass("hello",11,22);
    }
}