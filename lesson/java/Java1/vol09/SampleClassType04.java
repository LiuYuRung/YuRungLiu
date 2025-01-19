class Person9{
    String name;
    int age;

    Person9(String _name, int _age){
        name = _name;
        age = _age;
        System.out.println(name + "," + age);
    }
}

class SampleClassType04{
    public static void main(String[] args){
        Person9 p1 = new Person9("Tanaka",23);
        Person9 p2 = new Person9("Fukuda",18);
        p2 = null;
    }
}