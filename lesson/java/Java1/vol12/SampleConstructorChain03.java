class Sp{
    Sp(){
        System.out.println("コンストラクタSp()が呼びされました。");
    }
}
class Sub extends Sp{
    Sub(){
        System.out.println("コンストラクタSub()が呼びされました。");
    }
}
class SampleConstructorChain03{
    public static void main(String[] args){
        new Sub();
    }
}