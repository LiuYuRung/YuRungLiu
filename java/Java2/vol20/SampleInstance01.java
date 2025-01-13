// false
// false
// false
class SampleInstance01{
    public static void main(String[] args){

        String s1 = new String("AB");
        String s2 = new String("CD");
        String s3 = new String("AB");

        System.out.println(s1 == s2 );
        System.out.println(s2 == s3 );
        System.out.println(s3 == s1 );
    }
}