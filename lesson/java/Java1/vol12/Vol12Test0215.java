class MyClassA{}
class MyClassB extends MyClassA{}
class MyClassC extends MyClassB{}
class Test{
    public static void main(String[] args){
        MyClassC c1 = new MyClassC();
        MyClassC c2 = new MyClassB();//�G���[
        MyClassC c3 = new MyClassA();//�G���[

        MyClassB b1 = new MyClassC();
        MyClassB b2 = new MyClassB();
        MyClassB b3 = new MyClassA();//�G���[

        MyClassA a1 = new MyClassC();
        MyClassA a2 = new MyClassB();
        MyClassA a3 = new MyClassA();
    }
}