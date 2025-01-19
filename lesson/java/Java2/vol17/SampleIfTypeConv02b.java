interface I1{
}
interface I2 extends I1{
}
class S implements I2{
}
class SampleIfTypeConv02b{
    public static void main(String[] args){
        I1 i1 = new S();
        S s = (S)i1;
    }
}