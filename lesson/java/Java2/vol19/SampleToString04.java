//Yamada,33
class MyClass{
    String name = "Yamada";
    int age = 33;

    @Override
    public String toString(){
        return name + "," + age;
    }
}

class SampleToString04{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        String s = mc.toString();
        System.out.println(s);
    }
}