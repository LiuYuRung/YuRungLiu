//氏名：山田太郎、番号：A001
class Employee{
    private String name;//氏名
    private String no;  //社員番号


    //フィールドnameのsetter
    public void setName(String name){
        this.name = name;
    }

    //フィールドnoのsetter
    public void setNo(String no){
        this.no = no;
    }

    //フィールドnameのgetter
    public String getName(){
        return name;
    }

    //フィールドnoのgetter
    public String getNo(){
        return no;
    }
}
class SampleAccessor01c{
    public static void main(String[] args){
        Employee e = new Employee();
        e.setName("山田太郎");//setterでフィールドに値を設定
        e.setNo("A001");

        System.out.println("氏名：" + e.getName() + "、番号：" + e.getNo());
    }
}