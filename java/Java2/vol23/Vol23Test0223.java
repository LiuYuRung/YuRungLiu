// A
class Box<T>{
    private T t;

    public void setT(T t){
        this.t = t;
    }

    public T getT(){
        return t;
    }
}
class MyClass{
    String s = "A";
}

class Vol23Test0223{
    public static void main(String[] args){
        Box<MyClass> box = new Box<MyClass>();
        box.setT(new MyClass());
        MyClass mc = box.getT();
        System.out.println(mc.s);
    }
}