// true
class SampleInstance03{
    public static void main(String[] args){

        String s1 = new String("AB");
        String s2 = new String("CD");
        
        s2 = s1;

        System.out.println(s1 == s2 );
    }
}