// true
class Vol20Test1287{
    public static void main(String[] args){
        StringBuilder b1 = new StringBuilder("AB");
        StringBuilder b2 = b1.append("CD");
        System.out.println(b1 == b2);
    }
}