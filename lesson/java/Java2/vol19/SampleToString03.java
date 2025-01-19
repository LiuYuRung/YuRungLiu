//Sp@5ccd43c2
//Sub@4aa8f0b4
//Sub@7960847b
class Sp{}
class Sub extends Sp{}
class SampleToString03{
    public static void main(String[] args){
        Sp sp = new Sp();
        Sub sb = new Sub();
        Sp s = new Sub();

        System.out.println(sp);
        System.out.println(sb);
        System.out.println(s);
    }
}