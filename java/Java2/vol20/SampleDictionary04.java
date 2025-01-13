class SampleDictionary04{
    public static void main(String[] args){
        String s1 = new String("A");
        String s2 = new String("a");

        System.out.println(s1.compareTo(s2)); //-32
        System.out.println(s2.compareToIgnoreCase(s1)); //0
    }
}