class Student{
    static String name;
    static String no;

    static void showInfo(){
        System.out.println("氏名：" + name);
        System.out.println("番号：" + no);
    }
}
class SampleStaticMember03{
    public static void main(String[] args){
        Student.name = "Tanaka";
        Student.no = "09xx0101";

        Student.showInfo();
    }
}