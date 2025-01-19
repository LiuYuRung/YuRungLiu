class SampleWhile02{
    public static void main(String[] arg){
        int i = 1;                           //変数iの宣言・初期化 

        while(i <= 10){
            System.out.println(i + "回目");  //表示
            i++;                             //iをインクリメント
        }

        System.out.println("***終了***");
    }
}