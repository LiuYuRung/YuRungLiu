class MyClass{
    MyClass(int[] x){
        System.out.println("MyClass(int[])");
    }
    MyClass(int...x){
        System.out.println("MyClass(int...)");
    }
}
class Vol09Test0597{
    public static void main(String[] args){
        int[] x = new int[3];
        new MyClass(x);
    }
}