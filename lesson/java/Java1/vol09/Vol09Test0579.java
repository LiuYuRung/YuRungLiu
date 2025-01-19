class MyClass{
    MyClass(int[] x){
        System.out.print("A");
    }
}
class Vol09Test0579{
    public static void main(String[] args){
        new MyClass(new int[3]);
    }
}