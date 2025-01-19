class Sp{
}
class Sub extends Sp{
}
class SampleInheritanceType04{
    public static void main(String[] args){
        Sp sp = new Sp();
        Sub sb;

        sb =(Sub)sp;
    }
}