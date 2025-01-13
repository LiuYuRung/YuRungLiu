// true
// 85
// 85
class MyClass{
    private int x;

    public MyClass(int x){
        this.x = x;
    }
    @Override
    public boolean equals(Object obj){
        MyClass mc = (MyClass)obj;
        if(mc.x == this.x){
            return true;
        }else {
            return false;
        }
    }
    @Override
    public int hashCode(){
        return x * 17;
    }
}
class SampleHashcode02{
    public static void main(String[] args){
        MyClass mc1 = new MyClass(5); //MyClassのインスタンスの生成
        MyClass mc2 = new MyClass(5); //MyClassのインスタンスの生成

        //「equals」で比較
        System.out.println(mc1.equals(mc2));

        //各インスタンスのハッシュコードを取得・10進数で表示
        System.out.println(mc1.hashCode());
        System.out.println(mc2.hashCode());
    }
}