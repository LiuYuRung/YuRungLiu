class SampleTrim01{
    public static void main(String[] args){
        String s = new String(" A B C D ");
        System.out.println("[" + s + "]");//[ A B C D ]
        
        s = s.trim();

        System.out.println("[" + s + "]");//[A B C D]
    }
}