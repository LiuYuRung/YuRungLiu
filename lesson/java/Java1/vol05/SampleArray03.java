class SampleArray03{
    public static void main(String[] args){
        byte[] aByte = new byte[3];          //byte型配列の宣言・生成
        short[] aShort= new short[3];        //short型配列の宣言・生成
        int[] aInt = new int[3];             //int型配列の宣言・生成
        long[] aLong = new long[3];          //long型配列の宣言・生成
        float[] aFloat = new float[3];       //float型配列の宣言・生成
        double[] aDouble = new double[3];    //double型配列の宣言・生成
        char[] aChar = new char[3];          //char型配列の宣言・生成
        boolean[] aBoolean = new boolean[3]; //boolean型配列の宣言・生成 
        String[] aString = new String[3];    //String型配列の宣言・生成

        //各配列の初期値を確認
        System.out.println("byte型配列    : " + aByte[0]);
        System.out.println("short型配列   : " + aShort[0]);
        System.out.println("int型配列     : " + aInt[0]);
        System.out.println("long型配列    : " + aLong[0]);
        System.out.println("float型配列   : " + aFloat[0]);
        System.out.println("double型配列  : "+ aDouble[0]);
        System.out.println("char型配列    : " + aChar[0]); 
        System.out.println("boolean型配列 : " + aBoolean[0]);
        System.out.println("String型配列  : " + aString[0]);
    }
}