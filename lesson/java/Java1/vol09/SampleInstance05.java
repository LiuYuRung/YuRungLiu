class SampleInstance05{
    String name;
    int age;

    SampleInstance05(String _name, int _age){
        name = _name;
        age = _age;
        System.out.println(name + "," + age);
    }
    public static void main(String[] args){
        new SampleInstance05("tanaka",25);
        new SampleInstance05("Fukda", 45);
    }
}