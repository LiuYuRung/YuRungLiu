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
        // MyClass�N���X�̃C���X�^���X��Box�֊i�[
        Box b = new Box(new MyClass(7));

        // MyClass �N���X�̃C���X�^���X��Box������o��
        MyClass mc = (MyClass)b.getObj();

        System.out.println(mc.x);
    }
}