class SampleDictionary03{
    public static void main(String[] args){
        String s1 = new String("A");
        String s2 = new String("AC");

        System.out.println(s1.compareTo(s2)); //-1
        System.out.println(s2.compareTo(s1)); //1
    }
}