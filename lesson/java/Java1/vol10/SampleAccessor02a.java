//�����F�R�c���Y�A�ԍ��FA001
//�����F�R�c���Y�A�ԍ��FW009
class Student{
    String name;//����
    String no;  //�w�Дԍ�

    public Student(String name, String no){
        this.name = name;
        this.no = no;
    }
}

class SampleAccessor02a{
    public static void main(String[] args){
        Student s = new Student("�R�c���Y","A001");
        System.out.println("�����F" + s.name + "�A�ԍ��F" + s.no);
        s.no = "W009";
        System.out.println("�����F" + s.name + "�A�ԍ��F" + s.no);
    }
}