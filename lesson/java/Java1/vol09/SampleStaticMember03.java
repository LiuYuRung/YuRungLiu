class Student{
    static String name;
    static String no;

    static void showInfo(){
        System.out.println("éÅñºÅF" + name);
        System.out.println("î‘çÜÅF" + no);
    }
}
class SampleStaticMember03{
    public static void main(String[] args){
        Student.name = "Tanaka";
        Student.no = "09xx0101";

        Student.showInfo();
    }
}