class MyClass{
    public void finalize() throws Throwable{
        System.out.println("GCによってインスタンスを回収します");
    }
}
class Vol22Test0391{
    public static void main(String[] args){
        MyClass m = new MyClass();
        m = null;    //インスタンスをGCの対象にする
        System.gc();

        //時間稼ぎをする処理
        for(int i = 0; i <= 100; i++){
            System.out.print(i + " ");
        }
    }
}