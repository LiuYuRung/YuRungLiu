// s1�FString1
// s2�Fstring2
class SampleString01{
    public static void main(String[] args){
        char[] c = {'s', 't', 'r', 'i', 'n', 'g', '2'};

        String s1 = new String("String1");
        String s2 = new String(c);

        //���ꂼ��̕������\��
        System.out.println("s1�F" + s1 );
        System.out.println("s2�F" + s2 );
    }
}