class Sp{
    void foo(){
        System.out.println("Sp#foo()です。");
    }
}
class Sub extends Sp{
    private void foo(){
        System.out.println("Sub#foo()です。");
    }
}
class SampleOverride02b{
    public static void main(String[] args){
        Sub sb = new Sub(); //クラスSubの,Sub型変数Sbに代入
        sb.foo();           //インスタンスメソッドfooの呼び出し
    }
}