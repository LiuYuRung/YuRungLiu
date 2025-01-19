class SampleEquals02{
    public static void main(String[] args){
        String s1 = new String("AB");
        String s2 = new String("ab");

        System.out.println(s1.equalsIgnoreCase(s2)); //true
        System.out.println(s1 == s2 );               //false
    }
}