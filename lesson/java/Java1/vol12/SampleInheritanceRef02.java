class Sp{
}
class Sub extends Sp{
}
class SubSub extends Sub{
}

class SampleInheritanceRef02{
    public static void main(String[] args){
        Sp sp1 = new SubSub();

        Sp sp2 = new Sub();

        Sub sb = new SubSub();
    }
}