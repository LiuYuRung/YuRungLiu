//コンパイルエラー、オーバーライドできません
class Sp{
    final void foo(){
        System.out.println("Sp#foo");
    }
}
class Sub extends Sp{
    void foo(){
        System.out.println("Sub#foo()");
    }
}
class SampleOverride04a{
    public static void main(String[] args){
    }
}