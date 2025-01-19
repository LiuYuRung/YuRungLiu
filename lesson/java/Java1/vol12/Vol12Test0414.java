class Sp{}
class Sub extends Sp{}
class SubSub extends Sub{}
class Vol12Test0414{
    public static void mian(String[] args){
        Sp sp1 = new Sub();
        Sp sp2 = sp1;
        Sub sb = sp2;
    }
}