class Vol09MyClass0562{
    Vol09MyClass0562(int x ){
        System.out.print("A");
    }
    Vol09MyClass0562(float x){
        System.out.print("B");
    }
}
class Vol09Test0562{
    public static void main(String[] args){
        long x = 10;
        new Vol09MyClass0562(x);
    }
}