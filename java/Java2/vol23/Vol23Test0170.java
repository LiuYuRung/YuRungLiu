// A
// B
class Box<T>{
    private T t;

    public void setT(T t){
        this.t = t;
    }

    public T getT(){
        return t;
    }
}
class MyClassA{
    String s = "A";
}
class MyClassB{
    String s = "B";
}

class Vol23Test0170{
    public static void main(String[] args){
        Box box1 = new Box();
        box1.setT(new MyClassA());
        // MyClassA mca = (MyClassA)box1.getT();
        MyClassA mca = box1.getT();//�G���[�������Ȃ���(�W�F�l���b�N�X�𗘗p�����N���X�ł̓_�E���L���X�g�s�v)
        System.out.println(mca.s);

        Box<MyClassB> box2 = new Box<MyClassB>();
        box2.setT(new MyClassB());
        MyClassB mcb = box2.getT();
        System.out.println(mcb.s);
    }
}