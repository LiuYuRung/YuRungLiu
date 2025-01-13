//s1とs2は異なるインスタンスを指しています。
class SampleEquals03{
    public static void main(String[] args){
        String s1 = new String("fukuda");
        String s2 = new String("fukuda");

        if (s1 == s2){
            System.out.println("s1とs2は同じインスタンスを指しています。");
        } else {
            System.out.println("s1とs2は異なるインスタンスを指しています。");
        }
    }
}