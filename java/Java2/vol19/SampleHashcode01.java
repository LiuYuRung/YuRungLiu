// false
// false
// true
// 1509514333
// 1556956098
// 1509514333
class MyClass{
}
class SampleHashcode01{
    public static void main(String[] args){
        MyClass mc1 = new MyClass(); //MyClass�̃C���X�^���X�̐���
        MyClass mc2 = new MyClass(); //MyClass�̃C���X�^���X�̐���
        MyClass mc3 = mc1;           //mc3��mc1�̎Q�Ƃ���

        //�e�N���X�^�ϐ����uequals�v�Ŕ�r
        System.out.println(mc1.equals(mc2));
        System.out.println(mc2.equals(mc3));
        System.out.println(mc3.equals(mc1));

        //�e�C���X�^���X�̃n�b�V���R�[�h���擾�E10�i���ŕ\��
        System.out.println(mc1.hashCode());
        System.out.println(mc2.hashCode());
        System.out.println(mc3.hashCode());
    }
}