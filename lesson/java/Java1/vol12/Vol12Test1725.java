class Sp{
    static void foo(){
        System.out.println("A");
    }
}
class Sub extends Sp{
    void foo(){
        System.out.println("B");
    }
}
class Vol12Test1725{
    public static void main(String[] args){
        Sub sb = new Sub();
        sb.foo();
    }
}