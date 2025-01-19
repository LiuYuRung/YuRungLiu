//Sp#foo()
//Sub#foo()
//Sub#foo()
//Sp#foo()
//Sp#foo()
class Sp{
    static void foo(){
        System.out.println("Sp#foo()");
    }
}
class Sub extends Sp{
    static void foo(){
        System.out.println("Sub#foo()");
    }
}
class SampleOverride03a{
    public static void main(String[] args){
        Sp.foo();
        Sub.foo();

        Sub sb = new Sub();
        sb.foo();

        Sp sp1 = new Sub();
        sp1.foo();

        Sp sp2 = new Sp();
        sp2.foo();
    }
}