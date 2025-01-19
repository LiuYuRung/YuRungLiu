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
        this(name,age,"NO_DATA");
    }
    Customer(String name, String address){
        this(name, -1, address);
    }
    Customer(String name){
        this(name, -1,"NO_DATA");
    }
    void showInfo(){
        System.out.println("�����F" + name);
        System.out.println("�N��F" + age);
        System.out.println("�Z���G" + address);
    }
}
class SampleThisConstructor02{
    public static void main(String[] args){
        Customer c1 = new Customer("�R�c���Y",32,"�����s���c�s");
        Customer c2 = new Customer("��؉Ԏq",27);
        Customer c3 = new Customer("������Y");
        c1.showInfo();
        c2.showInfo();
        c3.showInfo();

    }
}