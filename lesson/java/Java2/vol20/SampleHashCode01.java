class SampleHashCode01{
    public static void main(String[] args){
        String s1 = new String("ABCD");
        String s2 = new String("EFGH");
        String s3 = new String("ABCD");

        System.out.println("s1：" + Integer.toHexString(s1.hashCode())); //s1：1e8c42
        System.out.println("s2：" + Integer.toHexString(s2.hashCode())); //s2：206d42
        System.out.println("s3：" + Integer.toHexString(s3.hashCode())); //s3：1e8c42
    }
}