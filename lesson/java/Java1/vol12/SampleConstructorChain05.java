class Sp{
    Sp(){
        System.out.println("�R���X�g���N�^Sp()���Ăт���܂����B");
    }
}
class Sub extends Sp{
    Sub(){
        System.out.println("�R���X�g���N�^Sub()���Ăт���܂����B");
    }
    Sub(int x){
        this();
        System.out.println("�R���X�g���N�^Sub(int)���Ăт���܂����B");
    }
}
class SampleConstructorChain05{
    public static void main(String[] args){
        new Sub(6);
    }
}