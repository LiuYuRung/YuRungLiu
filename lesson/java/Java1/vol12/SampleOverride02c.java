class Sp{
    private void foo(){
        System.out.println("Sp#foo()");
    }
}
class Sub extends Sp{
    private void foo(){
        System.out.println("Sub#foo()");
    }
}
class SampleOverride02c{
    public static void main(String[] args){
        //Sub sb = new Sub();

        //sb.foo(); 
    }
}