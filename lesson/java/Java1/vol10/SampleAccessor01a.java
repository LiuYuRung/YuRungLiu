//�����F�R�c���Y�A�ԍ��FA001
//�����F�R�c���Y�A�ԍ��FW009
class Employee{
    String name;//����
    String no;  //�Ј��ԍ�

    void setData(String name, String no){
        this.name = name;
        this.no = no;
    }
}
class SampleAccessor01a{
    public static void main(String[] args){
        Employee e = new Employee();
        e.setData("�R�c���Y","A001");

        System.out.println("�����F" + e.name + "�A�ԍ��F" + e.no);

        e.no = "W009";

        System.out.println("�����F" + e.name + "�A�ԍ��F" + e.no);

    }
}