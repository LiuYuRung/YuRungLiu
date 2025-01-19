//コンパイルエラー
class MyClassA{}//全く別のクラス
class MyClassB{}//
class SampleInstanceof{
    public static void main(String[] args){
        MyClassB b = new MyClassB();
        System.out.println(b instanceof MyClassA);
    }
}