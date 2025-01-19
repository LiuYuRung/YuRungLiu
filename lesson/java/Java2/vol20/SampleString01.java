// s1：String1
// s2：string2
class SampleString01{
    public static void main(String[] args){
        char[] c = {'s', 't', 'r', 'i', 'n', 'g', '2'};

        String s1 = new String("String1");
        String s2 = new String(c);

        //それぞれの文字列を表示
        System.out.println("s1：" + s1 );
        System.out.println("s2：" + s2 );
    }
}