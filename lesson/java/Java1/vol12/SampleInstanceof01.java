// true
// true
// false
// true
// true
// true
class Sp{}
class Sub extends Sp{}
class SampleInstanceof01{
    public static void main(String[] args){
        Sub sb = new Sub();
        Sp sp1 = new Sp();
        Sp sp2 = new Sub();

        System.out.println(sb instanceof Sub);
        System.out.println(sb instanceof Sp);
        System.out.println(sp1 instanceof Sub);
        System.out.println(sp1 instanceof Sp);
        System.out.println(sp2 instanceof Sub);
        System.out.println(sp2 instanceof Sp);

    }
}