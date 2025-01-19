//Sub#foo(int)
//Sub#foo(int)
//Sp#foo(int)
class MyClassSp{
}
class MyClassSub extends MyClassSp{
}
class Sp{
    MyClassSp foo(){
        System.out.println("Sp#foo()");
        return new MyClassSp();
    }
}
class Sub extends Sp{
    MyClassSub foo(){
        System.out.println("Sub#foo()");
        return new MyClassSub();
    }
}
class SampleOverride01d{
    public static void main(String[] args){
    }
}