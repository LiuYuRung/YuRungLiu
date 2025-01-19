class MyClassSp{}
class MyClassSub extends MyClassSp{}
class Sp{
    MyClassSp foo(){
        System.out.println("A");
        return new MyClassSp();
    }
}
class Sub extends Sp{
    MyClassSub foo(){
        System.out.println("B");
        return new MyClassSub();
    }
}
class Vol12Test1717{
    public static void main(String[] args){
        Sub sb = new Sub();
        sb.foo();
    }
}