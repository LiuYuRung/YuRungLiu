//7
class Box{
    private Object obj;

    public Box(Object obj){
        this.obj = obj;
    }
    public Object getObj(){
        return obj;
    }

    public void setObj(Object obj){
        this.obj = obj;
    }    
}
class MyClass{
    int x;
    MyClass(int x){
        this.x = x;
    }
}
class SampleObject03{
    public static void main(String[] args){
        // MyClassクラスのインスタンスをBoxへ格納
        Box b = new Box(new MyClass(7));

        // MyClass クラスのインスタンスをBoxから取り出す
        MyClass mc = (MyClass)b.getObj();

        System.out.println(mc.x);
    }
}