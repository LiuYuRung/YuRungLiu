class SampleArray04a {
    public static void main(String[] args){
        byte[] array;         //byte型配列の宣言
        array = new byte[-1]; //byte型配列の生成
    }                         //(要素数に-1を指定。実行時例外が生じる)
}