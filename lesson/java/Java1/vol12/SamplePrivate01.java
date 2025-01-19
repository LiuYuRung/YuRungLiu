//コンパイルエラー
class Sp{
    private void foo(){
        System.out.println("Sp#foo");
    }
}
class Sub extends Sp{
    void bar(){
        System.out.println("Sub#bar");
    }
}
class SamplePrivate01{
    public static void main(String[] args){
        Sub sb = new Sub();
        sb.bar();
        sb.foo();
    }
}