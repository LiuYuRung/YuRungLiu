class MyClass{
    String str;
    MyClass(String a){
        str = a;
    }
}
class Vol09Test071004{
    public static void main(String[] args){
        MyClass mca = new MyClass();
        mca = null;
        System.out.println(mca.str);
    }
}