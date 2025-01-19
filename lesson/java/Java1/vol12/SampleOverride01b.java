//Sub#foo(int)
//Sub#foo(int)
//Sp#foo(int)
class Sp{
    void foo(int i){
        System.out.println("Sp#foo(int)");
    }
}
class Sub extends Sp{
    void foo(int x){
        System.out.println("Sub#foo(int)");
    }
}
class SampleOverride01b{
    public static void main(String[] args){
        Sub sb = new Sub();
        sb.foo(2);

        Sp sp1 = new Sub();
        sp1.foo(2);

        Sp sp2 = new Sp();
        sp2.foo(2);
    }
}