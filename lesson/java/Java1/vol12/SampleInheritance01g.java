//SP
//SUB
//SP
//SUB
class Sp{
    static String s ="SP";
}
class Sub extends Sp{
    static String s ="SUB";
}
class SampleInheritance01g{
    public static void main(String[] args){
        System.out.println(Sp.s);
        System.out.println(Sub.s);

        Sp sp = new Sub();
        System.out.println(sp.s);

        Sub sb = new Sub();
        System.out.println(sb.s);

    }
}