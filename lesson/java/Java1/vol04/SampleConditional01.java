class SampleConditional01{
    public static void main(String[] args){
        int x = 5; //比較用
        int y = 3; //比較用
        int max;   //最大値を格納

        //xとyの値を比較し最大値をmaxに格納
        max = (x > y) ? x : y;

        //結果の表示
        System.out.println("最大値は" + max + "です。");
    }
}