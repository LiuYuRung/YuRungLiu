//�����F�R�c���Y�A�ԍ��FA001
class Student{
    private String name;//����
    private String no;  //�w�Дԍ�

    public Student(String name, String no){
        this.name = name;
        this.no = no;
    }
    public String getName(){
        return name;
    }
    public String getNo(){
        return no;
    }
}

class SampleAccessor02b{
    public static void main(String[] args){
        Student s = new Student("�R�c���Y","A001");
        System.out.println("�����F" + s.getName() + "�A�ԍ��F" + s.getNo());
    }
}