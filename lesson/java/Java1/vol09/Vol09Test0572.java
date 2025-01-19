class MyClass{
    MyClass(int x, int y){
        System.out.print("A");
    }
    MyClass(int x){
        System.out.print("B");
    }
    MyClass(int...i){
        System.out.print("C");
    }
}
class Vol09Test0572{
    public static void main(String[] args){
        int i = 1, j = 3;
        new MyClass();
        new MyClass(i);
        new MyClass(i,j);

    }
}