class Student{
    static String name;
    static String no;
}

class SampleStaticMember01{
    public static void main(String[] args){
        Student.name = "Tanaka";
        Student.no = "09XX0101";

        System.out.println("氏名：" + Student.name);
        System.out.println("番号：" + Student.no);
    }
}