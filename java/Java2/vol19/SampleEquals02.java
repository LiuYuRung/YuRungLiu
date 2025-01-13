// false
// false
// true
class MyClass{}
class SampleEquals02{
    public static void main(String[] args){
        MyClass mc1 = new MyClass();  //MyClassのインスタンスの生成
        MyClass mc2 = new MyClass();  //MyClassのインスタンスの生成
        MyClass mc3 = mc1;            //mc3にmc1参照を代入

        //各クラス型変数を「==」で比較
        System.out.println(mc1.equals(mc2));
        System.out.println(mc2.equals(mc3));
        System.out.println(mc3.equals(mc1));
    }
}