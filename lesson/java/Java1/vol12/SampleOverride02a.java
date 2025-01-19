//Sub#foo()
class Sp{
    void foo(){
        System.out.println("Sp#foo()");
    }
}
class Sub extends Sp{
    public void foo(){
        System.out.println("Sub#foo()");
    }
}
class SampleOverride02a{
    public static void main(String[] args){
        Sub sb = new Sub(); //クラスSubの
                            //Sub型変数Sbに代入
        sb.foo();           //sbよりインスタンスメソッドfooの呼び出し
    }
}