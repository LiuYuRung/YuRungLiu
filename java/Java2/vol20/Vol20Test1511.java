class Vol20Test1511{
    public static void main(String[] args){
        StringBuffer bf = new StringBuffer("abc");
        StringBuilder bl = new StringBuilder("abc");

        System.out.println(bl.equals(bf)); //false
        // System.out.println(bl == bf);      
    }
}