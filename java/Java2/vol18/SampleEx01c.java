//Exception in thread "main" java.lang.NullPointerException
//        at SampleEx01c.main(SampleEx01c.java:9)
class MyClass{
    void foo(){
        System.out.println("MyClass#foo()");
    }
}
class SampleEx01c{
    public static void main(String[] args){
        MyClass mc = null;
        mc.foo(); //null�Q�Ƃ�ʂ��Ĕ�static�ȃ����o�[�𗘗p
    }
}