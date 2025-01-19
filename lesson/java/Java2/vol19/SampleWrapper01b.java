// 127
// 32767
// 100
// 100
// 12.0
// 12.0
class SampleWrapper01b{
    public static void main(String[] args){
        Byte b = new Byte("127");
        short s = new Short("32767");
        Integer i = new Integer("100");
        Long l = new Long("100");
        Float f = new Float("12.0F");
        Double d = new Double("12.0D");

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}