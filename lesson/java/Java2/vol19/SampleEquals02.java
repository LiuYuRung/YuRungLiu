// false
// false
// true
class MyClass{}
class SampleEquals02{
    public static void main(String[] args){
        MyClass mc1 = new MyClass();  //MyClass�̃C���X�^���X�̐���
        MyClass mc2 = new MyClass();  //MyClass�̃C���X�^���X�̐���
        MyClass mc3 = mc1;            //mc3��mc1�Q�Ƃ���

        //�e�N���X�^�ϐ����u==�v�Ŕ�r
        System.out.println(mc1.equals(mc2));
        System.out.println(mc2.equals(mc3));
        System.out.println(mc3.equals(mc1));
    }
}