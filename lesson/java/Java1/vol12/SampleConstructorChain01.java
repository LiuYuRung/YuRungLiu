class Sp{
    Sp(int x){ //スーパークラスのコンストラクター
        System.out.println("コンストラクタsp(int)が呼びされました。" + x);
    }                                  // ↑シグネチャ
}

class Sub extends Sp{ //サブクラスのコンストラクター
    Sub(){
        super(5); //2行目に書いたらエラー
        System.out.println("コンストラクタSub()が呼びされました。");
    }                                  // ↑シグネチャ
}

class SampleConstructorChain01{
    public static void main(String[] args){
        new Sub(); //インスタンス生成式
    }              //①インスタンス生成（最後に参照値が付与）
}                  //②コンストラクター実行（サブクラスのコンストラクターが実行）