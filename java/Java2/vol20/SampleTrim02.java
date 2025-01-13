class SampleTrim02{
    public static void main(String[] args){
        String s = new String("     Test    ");
        System.out.println("[" + s + "]");       //[     Test    ]
        System.out.println("[" + s.trim() + "]");//[Test]
    }
}