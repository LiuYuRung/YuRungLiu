class SampleArray06b{
    public static void main(String[] args){
        //int型配列の宣言・生成
        int[] ai = new int[5];

        //各要素に値を代入
        ai[0] = 78;
        ai[1] = 92;
        ai[2] = 80;
        ai[3] = 100;
        ai[4] = 55;

        //要素の一覧表示
        for (int i = 0; i < 5; i++) {
            System.out.println("ai[" + i + "] = " + ai[i]);
        }
    }
}