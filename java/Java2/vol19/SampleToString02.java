//MyClass@59f95c5d
//MyClass@59f95c5d
class MyClass{
    String name = "Yamada";
    int age = 33;
}

class SampleToString02{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        System.out.println(mc);
        System.out.println(mc.toString());
    }
}