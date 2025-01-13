// true
// false
// true
// false
// true
// false
// false
class SampleWrapper01c{
    public static void main(String[] args){
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(false);
        Boolean b3 = new Boolean("true");
        Boolean b4 = new Boolean("false");
        Boolean b5 = new Boolean("True");
        Boolean b6 = new Boolean("False");
        Boolean b7 = new Boolean("TEST");        

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);
    }
}