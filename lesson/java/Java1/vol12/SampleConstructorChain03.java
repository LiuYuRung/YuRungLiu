class Sp{
    Sp(){
        System.out.println("�R���X�g���N�^Sp()���Ăт���܂����B");
    }
}
class Sub extends Sp{
    Sub(){
        System.out.println("�R���X�g���N�^Sub()���Ăт���܂����B");
    }
}
class SampleConstructorChain03{
    public static void main(String[] args){
        new Sub();
    }
}