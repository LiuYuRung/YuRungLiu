class SampleWhile03{
    public static void main(String[] args){
        int i = 1;
        
        while(i <= 10) {
            int x = 0;
            System.out.println(i + "回目 : " + x );
            x++;
            i++;
        }

        System.out.println("***終了***");             //while文を抜けたことを通知
    }
}