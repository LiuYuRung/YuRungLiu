class Sp{
    void foo(){
        System.out.println("Sp#foo()�ł��B");
    }
}
class Sub extends Sp{
    private void foo(){
        System.out.println("Sub#foo()�ł��B");
    }
}
class SampleOverride02b{
    public static void main(String[] args){
        Sub sb = new Sub(); //�N���XSub��,Sub�^�ϐ�Sb�ɑ��
        sb.foo();           //�C���X�^���X���\�b�hfoo�̌Ăяo��
    }
}