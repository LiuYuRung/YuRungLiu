class Sp{
    Sp(int x){ //�����̂Ȃ��R���X�g���N�^�������Ȃ�
        System.out.println("�R���X�g���N�^Sp(int)���Ăт���܂���");
    }
}
class Sub extends Sp{
    Sub(){ //�Öق̃X�[�p�[�R���X�g���N�^�̌Ăяo���usuper();�v���s���Ă���
        System.out.println("�R���X�g���N�^Sub()���Ăт���܂���");
    }
}
class SampleConstructorChain04{
    public static void main(String[] args){
        new Sub();
    }
}