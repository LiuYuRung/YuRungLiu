class SampleUpperLower03{
    public static void main(String[] args){
        String s = new String("Test1234@yahoo.com");
        System.out.println(s);//Test1234@yahoo.com

        s = s.toLowerCase();
        System.out.println(s);//test1234@yahoo.com

        s = s.toUpperCase();
        System.out.println(s);//TEST1234@YAHOO.COM
    }
}