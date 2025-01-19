class Customer{
    String name;
    int age;
    String address;

    Customer(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    Customer(String name, int age){
        this.name = name;
        this.age = age;
        this.address = "NO_DATA";
    }
    Customer(String name, String address){
        this.name = name;
        this.age = -1;
        this.address = address;
    }
    Customer(String name){
        this.name = name;
        this.age = -1;
        this.address = "NO_DATA";
    }
    void showInfo(){
        System.out.println("氏名：" + name);
        System.out.println("年齢：" + age);
        System.out.println("住所；" + address);
    }
}
class SampleThisConstructor01{
    public static void main(String[] args){
        Customer c1 = new Customer("山田太郎",32,"東京都町田市");
        Customer c2 = new Customer("鈴木花子",27);
        Customer c3 = new Customer("佐藤一郎");
        c1.showInfo();
        c2.showInfo();
        c3.showInfo();

    }
}