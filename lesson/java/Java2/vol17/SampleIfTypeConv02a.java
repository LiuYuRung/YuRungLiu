interface I{
}
class S implements I {
}
class SampleIfTypeConv02a{
    public static void main(String[] args){
        I i = new S();
        S s =(S)i;
    }
}