// false
// false
// true
class SamplePool01{
    public static void main(String[] args){

        String s1 = "ABCD";
        String s2 = "EFGH";
        String s3 = "ABCD";

        System.out.println(s1 == s2 );
        System.out.println(s2 == s3 );
        System.out.println(s3 == s1 );
    }
}