interface I {
}
class S implements I {
}
class C{
}
class SampleIfTypeConv02c{
    public static void main(String[] args){
        I i = new S();
        C c =(C)i;
    }
}