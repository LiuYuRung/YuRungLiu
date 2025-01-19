class MyClassA{}
class MyClassB extends MyClassA{}
class MyClassC extends MyClassB{}
class Test{
    public static void main(String[] args){
        MyClassC c1 = new MyClassC();
        MyClassC c2 = new MyClassB();//エラー
        MyClassC c3 = new MyClassA();//エラー

        MyClassB b1 = new MyClassC();
        MyClassB b2 = new MyClassB();
        MyClassB b3 = new MyClassA();//エラー

        MyClassA a1 = new MyClassC();
        MyClassA a2 = new MyClassB();
        MyClassA a3 = new MyClassA();
    }
}