//true
class Sp{}
class Sub extends Sp{}
class SampleInstanceof02{
    public static void main(String[] args){
        Sub sb = new Sub();
        System.out.println(sb instanceof Object);
    }
}