class SamplePool06{
    public static void main(String[] args){
        String s = "ABCD";

        String s1 = "AB";
        String s2 = "CD";

        String s3 = "AB" + "CD";
        String s4 = "AB" + s2;
        String s5 = s1 + "CD";
        String s6 = s1 + s2;

        System.out.println(s == s3 );// true
        System.out.println(s == s4 );// false
        System.out.println(s == s5 );// false
        System.out.println(s == s6 );// false
    }
}