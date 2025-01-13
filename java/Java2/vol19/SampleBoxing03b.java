// false
// true
// true
// false
class SampleBoxing03b{
    public static void main(String[] args){
        Boolean b1 = new Boolean("true");
        Boolean b2 = new Boolean("false");

        System.out.println(b1 & b2);
        System.out.println(b1 | b2);
        System.out.println(b1 ^ b2);
        System.out.println(!b1);

    }
}