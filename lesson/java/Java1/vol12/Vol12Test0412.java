class Sp{}
class Sub extends Sp{}
class SubSub extends Sub{}
class Vol12Test0412{
    public static void main(String[] args){
        Sub sb = new SubSub();
        Sp sp =sb;
        SubSub sbsb = (Sp)sp;
    }
}