//氏名：山田太郎、番号：A001
//氏名：山田太郎、番号：W009
class Employee{
    String name;//氏名
    String no;  //社員番号

    void setData(String name, String no){
        this.name = name;
        this.no = no;
    }
}
class SampleAccessor01a{
    public static void main(String[] args){
        Employee e = new Employee();
        e.setData("山田太郎","A001");

        System.out.println("氏名：" + e.name + "、番号：" + e.no);

        e.no = "W009";

        System.out.println("氏名：" + e.name + "、番号：" + e.no);

    }
}