class Vol20Test1527{
    public static void main(String[] args){
        StringBuffer bf = new StringBuffer("abc");
        String str = "abc";

        System.out.println(bf.equals(str)); //false
        System.out.println(str.equals(bf)); //false

        // System.out.println(bf == str);    
    }
}