//コンパイルエラー
class Vol18Test0943{
    public static void main(String[] args){
        int x = 2,y = 0;
        try{
            int result = x/y;
            System.out.println("try");
        }catch(Exception e){
            System.out.println("catch1");
        }catch(ArithmeticException e){
            System.out.println("catch2");
        }
    }
}