class MyClass{
    int x;
    void MyClass(int x){
        this.x = x;
    }
    MyClass(){
        this(-1);
    }
}
class Vol09Test1704{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        System.out.println(mc.x);
    }
}