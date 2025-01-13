class Vol20Test1481{
    public static void main(String[] args){
        StringBuffer bf1 = new StringBuffer("abc");
        StringBuffer bf2 = new StringBuffer("abc");

        StringBuilder bl1 = new StringBuilder("abc");
        StringBuilder bl2 = new StringBuilder("abc");

        System.out.println(bf1.equals(bf2)); //false
        System.out.println(bf1 == bf2);      //false

        System.out.println(bl1.equals(bl2)); //false
        System.out.println(bl1 == bl2);      //false
    }
}