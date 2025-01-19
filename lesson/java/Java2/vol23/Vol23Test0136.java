// A
// B
class Box{
    private Object obj;

    public void setObj(Object obj){
        this.obj = obj;
    }

    public Object getObj(){
        return obj;
    }
}
class MyClassA{
    String s = "A";
}
class MyClassB{
    String s = "B";
}

class Vol23Test0136{
    public static void main(String[] args){
        Box box1 = new Box();
        box1.setObj(new MyClassA());
        MyClassA mca = (MyClassA)box1.getObj();
        System.out.println(mca.s);

        Box box2 = new Box();
        box2.setObj(new MyClassB());
        MyClassB mcb = (MyClassB)box2.getObj();
        System.out.println(mcb.s);
    }
}