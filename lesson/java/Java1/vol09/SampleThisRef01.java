class Customer{
    String name;
    int age;
    String address;

    Customer(String _name, int _age, String _address){
        name = _name;
        age = _age;
        address = _address;
    }
    void showInfo(){
        System.out.println("�����F" + name);
        System.out.println("�N��F" + age);
        System.out.println("�Z���G" + address);
    }
}
public class SampleThisRef01{
    public static void main(String[] args){
        Customer c1 = new Customer("�R�c���Y",32,"�����s���c�s");
        Customer c2 = new Customer("��؉Ԏq",27,"��ʌ��u�؎s");
        c1.showInfo();
        c2.showInfo();
    }
}