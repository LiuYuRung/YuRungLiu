//�R���p�C���G���[
class Employee{
    private String name;//����
    private String no;  //�Ј��ԍ�
//�ʂ̃N���X�uSampleAccessor01b�v����̒��ڃA�N�Z�X���֎~
    void setData(String name, String no){
        this.name = name;
        this.no = no;
    }
}
class SampleAccessor01b{
    public static void main(String[] args){
        Employee e = new Employee();

        e.setData("�R�c���Y","A001");

        e.no = "W009";//�R���p�C���G���[�ƂȂ�

    }
}