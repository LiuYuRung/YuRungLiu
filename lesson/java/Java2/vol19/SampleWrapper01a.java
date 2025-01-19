// 127
// 32767
// 100
// 100
// 12.0
// 12.0
// A
class SampleWrapper01a{
    public static void main(String[] args){
        Byte b = new Byte((byte)127);
        short s = new Short((short)32767);
        Integer i = new Integer(100);
        Long l = new Long(100L);
        Float f = new Float(12.0F);
        Double d = new Double(12.0D);
        Character c = new Character('A');

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
    }
}