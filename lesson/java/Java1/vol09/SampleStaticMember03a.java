class Student{
    static String name;
    static String no;

    static void showInfo(){
        System.out.println("氏名：" + name);
        System.out.println("番号：" + no);
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