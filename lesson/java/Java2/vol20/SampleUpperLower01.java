class SampleUpperLower01{
    public static void main(String[] args){
        String s1 = new String("ABCD");
        String s2 = new String("abcd");
        String s3 = new String("ABCD");

        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        s3 = s3.toUpperCase();

        System.out.println(s1);// ABCD
        System.out.println(s2);// ABCD
        System.out.println(s3);// ABCD
    }
}