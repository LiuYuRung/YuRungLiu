class MyClass{
    MyClass(int[] x){
        System.out.println("MyClass(int[])");
    }
    MyClass(byte[] x){
        System.out.println("MyClass(byte[])");
    }
}
class Vol09Test0591{
    public static void main(String[] args){
        short[] x =new short[3];
        new MyClass(x);
    }
}