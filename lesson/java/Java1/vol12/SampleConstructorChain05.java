class Sp{
    Sp(){
        System.out.println("コンストラクタSp()が呼びされました。");
    }
}
class Sub extends Sp{
    Sub(){
        System.out.println("コンストラクタSub()が呼びされました。");
    }
    Sub(int x){
        this();
        System.out.println("コンストラクタSub(int)が呼びされました。");
    }
}
class SampleConstructorChain05{
    public static void main(String[] args){
        new Sub(6);
    }
}