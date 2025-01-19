class SampleArray09{
    public static void main(String[] args){
        //2次元配列の宣言・生成
        int[][] array = new int[2][3];

        //各要素に値を代入
        array[0][0] = 11;
        array[0][1] = 12;
        array[0][2] = 13;
        array[1][0] = 21;
        array[1][1] = 22;
        array[1][2] = 23;

        //各要素を表示
        System.out.println("array[0][0] = " + array[0][0]);
        System.out.println("array[0][1] = " + array[0][1]);
        System.out.println("array[0][2] = " + array[0][2]);
        System.out.println("array[1][0] = " + array[1][0]);
        System.out.println("array[1][1] = " + array[1][1]);
        System.out.println("array[1][2] = " + array[1][2]);

    }
}