interface I{
}
class S implements I {
}
class SampleIfTypeConv01a{
    public static void main(String[] args){
        S s = new S();
        I i = s;
    }
}