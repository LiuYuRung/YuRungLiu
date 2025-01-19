interface I1{
}
interface I2{
}
class S implements I2{
}
class SampleIfTypeConv03b{
    public static void main(String[] args){
        I1 i1;
        I2 i2 = new S();
        i1 = (I1)i2;
    }
}