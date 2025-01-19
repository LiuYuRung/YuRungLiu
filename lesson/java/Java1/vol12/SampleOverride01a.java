//Sub#foo()
//Sub#foo()
//Sp#foo()
class Sp{
    void foo(){
        System.out.println("Sp#foo()");
    }
}
class Sub extends Sp{
    void foo(){
        System.out.println("Sub#foo()");
    }
}
class SampleOverride01a{
    public static void main(String[] args){
        Sub sb = new Sub();
        sb.foo();

        Sp sp1 = new Sub();
        sp1.foo();

        Sp sp2 =new Sp();
        sp2.foo();
    }
}