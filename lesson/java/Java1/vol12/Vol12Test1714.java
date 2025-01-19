class Sp{
    int foo(){
        System.out.println("A");
        return 2;
    }
}
class Sub extends Sp{
    double foo(){
        System.out.println("B");
        return 2.0;
    }
}
class Vol12Test1714{
    public static void main(String[] args){
        Sub sb = new Sub();
        sb.foo();
    }
}