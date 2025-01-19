// false
// false
// true
// 1509514333
// 1556956098
// 1509514333
class MyClass{
}
class SampleHashcode01{
    public static void main(String[] args){
        MyClass mc1 = new MyClass(); //MyClassのインスタンスの生成
        MyClass mc2 = new MyClass(); //MyClassのインスタンスの生成
        MyClass mc3 = mc1;           //mc3にmc1の参照を代入

        //各クラス型変数を「equals」で比較
        System.out.println(mc1.equals(mc2));
        System.out.println(mc2.equals(mc3));
        System.out.println(mc3.equals(mc1));

        //各インスタンスのハッシュコードを取得・10進数で表示
        System.out.println(mc1.hashCode());
        System.out.println(mc2.hashCode());
        System.out.println(mc3.hashCode());
    }
}