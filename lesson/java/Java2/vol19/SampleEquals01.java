// false
// false
// true
class MyClass{}
class SampleEquals01{
    public static void main(String[] args){
        MyClass mc1 = new MyClass();  //MyClass�̃C���X�^���X�̐���
        MyClass mc2 = new MyClass();  //MyClass�̃C���X�^���X�̐���
        MyClass mc3 = mc1;            //mc3��mc1�Q�Ƃ���

        //�e�N���X�^�ϐ����u==�v�Ŕ�r
        System.out.println(mc1==mc2);
        System.out.println(mc2==mc3);
        System.out.println(mc3==mc1);
    }
}