class SampleEquals01{
    public static void main(String[] args){
        String s1 = new String("AB");
        String s2 = new String("AB");

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2 );     //false
    }
}