//Sub#foo()
class Sp{
    void foo(){
        System.out.println("Sp#foo()");
    }
}
class Sub extends Sp{
    public void foo(){
        System.out.println("Sub#foo()");
    }
}
class SampleOverride02a{
    public static void main(String[] args){
        Sub sb = new Sub(); //�N���XSub��
                            //Sub�^�ϐ�Sb�ɑ��
        sb.foo();           //sb���C���X�^���X���\�b�hfoo�̌Ăяo��
    }
}