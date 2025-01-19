interface I1{
}
interface I2 extends I1{
}
class S implements I2{
}
class SampleIfTypeConv01b{
    public static void main(String[] args){
        S s = new S();
        I1 i1 = s;
        I2 i2 = s;
    }
}