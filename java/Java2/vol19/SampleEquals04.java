//s1とs2は同じ文字列です。
class SampleEquals04{
    public static void main(String[] args){
        String s1 = new String("fukuda");
        String s2 = new String("fukuda");

        if (s1.equals(s2)){
            System.out.println("s1とs2は同じ文字列です。");
        } else {
            System.out.println("s1とs2は異なる文字列です。");
        }
    }
}