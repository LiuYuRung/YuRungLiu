class Sp{}
class SubA extends Sp{}
class SubB extends Sp{}
class Vol12Test0212{
    public static void main(String[] args){
        Sp spa = new SubA();
        Sp spb = new SubB();
        SubA sba = new SubA();
        SubB sbb = new SubB();
        SubA sb = new SubB();//完全一致ではない、代入することはできない
    }
}