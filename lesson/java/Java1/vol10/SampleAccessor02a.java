//氏名：山田太郎、番号：A001
//氏名：山田太郎、番号：W009
class Student{
    String name;//氏名
    String no;  //学籍番号

    public Student(String name, String no){
        this.name = name;
        this.no = no;
    }
}

class SampleAccessor02a{
    public static void main(String[] args){
        Student s = new Student("山田太郎","A001");
        System.out.println("氏名：" + s.name + "、番号：" + s.no);
        s.no = "W009";
        System.out.println("氏名：" + s.name + "、番号：" + s.no);
    }
}