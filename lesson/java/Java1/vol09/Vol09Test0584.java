class MyClass{
    MyClass(){
        System.out.print("A");
    }
    MyClass(int x ){
        System.out.print("B");
    }
    MyClass(double x){
        System.out.print("C");
    }
}

class Vol09Test0584{
    public static void main(String[] args){
        int x = 12;
        float f = 12.3F;
        new MyClass(x);
        new MyClass();
        new MyClass(f);

    }
}