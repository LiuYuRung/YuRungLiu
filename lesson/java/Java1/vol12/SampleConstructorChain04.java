class Sp{
    Sp(int x){ //引数のないコンストラクタを持たない
        System.out.println("コンストラクタSp(int)が呼びされました");
    }
}
class Sub extends Sp{
    Sub(){ //暗黙のスーパーコンストラクタの呼び出し「super();」が行われている
        System.out.println("コンストラクタSub()が呼びされました");
    }
}
class SampleConstructorChain04{
    public static void main(String[] args){
        new Sub();
    }
}