interface I1{
}
interface I2 extends I1{
}
class S implements I1{
}
class SampleIfTypeConv04b{
    public static void main(String[] args){
        I1 i1 = new S();
        I2 i2;
        i2 =(I2)i1;
    }
}