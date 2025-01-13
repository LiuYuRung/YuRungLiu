// A
class Box{
    private Object t;

    public void setT(Object t){
        this.t = t;
    }

    public Object getT(){
        return t;
    }
}
class MyClassA{
    String s = "A";
}

class Vol23Test0252{
    public static void main(String[] args){
        Box box = new Box();
        box.setT(new MyClass());
        MyClass mc = (MyClass)box.getT();
        System.out.println(mc.s);
    }
}