//コンパイルエラー
class Employee{
    private String name;//氏名
    private String no;  //社員番号
//別のクラス「SampleAccessor01b」からの直接アクセスが禁止
    void setData(String name, String no){
        this.name = name;
        this.no = no;
    }
}
class SampleAccessor01b{
    public static void main(String[] args){
        Employee e = new Employee();

        e.setData("山田太郎","A001");

        e.no = "W009";//コンパイルエラーとなる

    }
}