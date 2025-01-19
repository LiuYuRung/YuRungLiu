//true
class Data{
    int x;
}
class MyClass{
    Data data;
    MyClass(Data data){
        this.data = data;
    }
}
class Vol19Test0718{
    public static void main(String[] args){
        Data d = new Data();
        d.x = 10;
        MyClass mc1 = new MyClass(d);
        MyClass mc2 = new MyClass(d);
        System.out.println(mc1.data == mc2.data);
    }
}