//ゼロ除算されました。
//プログラムの終わりです
class SampleTry01b{
    public static void main(String[] args){
        int a, b, result;

        try{
            a = 5;
            b = 0;

            result = a / b;

            System.out.println("a / b = " + result);
        }catch(ArithmeticException ae){
            System.out.println("ゼロ除算されました。");
        }

        System.out.println("プログラムの終わりです");
    }
}