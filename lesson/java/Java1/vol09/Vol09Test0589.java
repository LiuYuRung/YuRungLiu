class MyClass{
    MyClass(int x){
        System.out.print("A");
    }
    MyClass(int x, int y){
        System.out.print("B");
    }
}
class Vol09Test0589{
    public static void main(String[] args){
        int x = 10;
        new MyClass(x);
        new MyClass(x, x);
    }
}