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
        System.out.println("–¼F" + name);
        System.out.println("”N—îF" + age);
        System.out.println("ZŠG" + address);
    }
}
public class SampleThisRef01{
    public static void main(String[] args){
        Customer c1 = new Customer("R“c‘¾˜Y",32,"“Œ‹“s’¬“cs");
        Customer c2 = new Customer("—é–Ø‰Ôq",27,"é‹ÊŒ§u–Øs");
        c1.showInfo();
        c2.showInfo();
    }
}