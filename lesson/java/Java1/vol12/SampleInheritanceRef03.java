class Sp{
}
class SubA extends Sp{
}
class SubB extends Sp{
}
class SampleInheritanceRef03{
    public static void main(String[] args){
        Sp sp1 = new SubA();

        Sp sp2 = new SubB();
        //SubA sba = new SubB();
        //SubB sbb = new SubA();
    }
}