// true
// 85
// 85
class MyClass{
    private int x;

    public MyClass(int x){
        this.x = x;
    }
    @Override
    public boolean equals(Object obj){
        MyClass mc = (MyClass)obj;
        if(mc.x == this.x){
            return true;
        }else {
            return false;
        }
    }
    @Override
    public int hashCode(){
        return x * 17;
    }
}
class SampleHashcode02{
    public static void main(String[] args){
        MyClass mc1 = new MyClass(5); //MyClass�̃C���X�^���X�̐���
        MyClass mc2 = new MyClass(5); //MyClass�̃C���X�^���X�̐���

        //�uequals�v�Ŕ�r
        System.out.println(mc1.equals(mc2));

        //�e�C���X�^���X�̃n�b�V���R�[�h���擾�E10�i���ŕ\��
        System.out.println(mc1.hashCode());
        System.out.println(mc2.hashCode());
    }
}