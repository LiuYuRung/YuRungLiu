class SampleHashCode01{
    public static void main(String[] args){
        String s1 = new String("ABCD");
        String s2 = new String("EFGH");
        String s3 = new String("ABCD");

        System.out.println("s1�F" + Integer.toHexString(s1.hashCode())); //s1�F1e8c42
        System.out.println("s2�F" + Integer.toHexString(s2.hashCode())); //s2�F206d42
        System.out.println("s3�F" + Integer.toHexString(s3.hashCode())); //s3�F1e8c42
    }
}