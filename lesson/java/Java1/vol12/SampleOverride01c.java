class Sp{
    void foo(){
        System.out.println("Sp#foo()");
    }
}
class Sub extends Sp{
    int foo(){
        System.out.println("Sub#foo()");
        return 2;
    }
}
class SampleOverride01c{
    public static void main(String[] args){
    }
}
