class Sp{
    void foo(){
        System.out.println("Sp#foo()");
    }
}
class Sub extends Sp{
    static void foo(){
        System.out.println("Sub#foo()");
    }
}
class SampleOverride03b{
    public static void main(String[] args){
    }
}