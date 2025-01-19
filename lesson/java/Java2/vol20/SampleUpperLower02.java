class SampleUpperLower02{
    public static void main(String[] args){
        String s1 = new String("ABCD");
        String s2 = new String("abcd");
        String s3 = new String("ABCD");

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        s3 = s3.toLowerCase();

        System.out.println(s1);// abcd
        System.out.println(s2);// abcd
        System.out.println(s3);// abcd
    }
}