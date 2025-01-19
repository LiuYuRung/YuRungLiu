interface I1 {   
}
interface I2 extends I1{
}
class S implements I2{
}
class SampleIfTypeConv03a{
    public static void main(String[] args){
        I1 i1;
        I2 i2 = new S();
        i1 = i2;
    }
}