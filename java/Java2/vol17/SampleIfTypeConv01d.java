interface I{
}
class C{
}
class SampleIfTypeConv01c{
    public static void main(String[] args){
        C c = new C();
        I i =(I)c;
    }
}