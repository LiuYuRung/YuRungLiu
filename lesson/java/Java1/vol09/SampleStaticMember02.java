class Student{
    static String name;
    static String no;
}
class SampleStaticMember02{
    public static void main(String[] args){
        Student.name = "Tanaka";
        Student.no = "09xx0101";

        Student.name="Yamada";
        Student.no = "09xx0102";

        System.out.println("氏名：" + Student.name);
        System.out.println("番号：" + Student.no);
    }
}