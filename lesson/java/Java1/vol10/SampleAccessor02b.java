//氏名：山田太郎、番号：A001
class Student{
    private String name;//氏名
    private String no;  //学籍番号

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
        Student s = new Student("山田太郎","A001");
        System.out.println("氏名：" + s.getName() + "、番号：" + s.getNo());
    }
}