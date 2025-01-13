// false
// true
class SamplePool04{
    public static void main(String[] args){
        String s1 = new String("ABCD");
        String s2 = "ABCD";
        String s3 = "AB"+"CD";

        System.out.println(s1 == s3 );
        System.out.println(s2 == s3 );
    }
}