class MyClassSp{}
class MyClassSub extends MyClassSp{}
class Sp{
    MyClassSub foo(){
        return new MyClassSub();
    }
}
class Sub extends Sp{
    MyClassSp foo(){
        return new MyClassSp();
    }
}
class Vol12Test072901{
    public static void main(String[] args){
    }
}