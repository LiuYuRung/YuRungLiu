class Student{
    static String name;
    static String no;

    static void showInfo(){
        System.out.println("�����F" + name);
        System.out.println("�ԍ��F" + no);
    }
}
class SampleStaticMember03a{
    public static void main(String[] args){
        Student s = new Student();

        s.name = "Tanaka";
        s.no = "09xx0101";

        s.showInfo();
    }
}