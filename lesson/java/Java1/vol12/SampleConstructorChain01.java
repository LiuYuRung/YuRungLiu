class Sp{
    Sp(int x){ //�X�[�p�[�N���X�̃R���X�g���N�^�[
        System.out.println("�R���X�g���N�^sp(int)���Ăт���܂����B" + x);
    }                                  // ���V�O�l�`��
}

class Sub extends Sp{ //�T�u�N���X�̃R���X�g���N�^�[
    Sub(){
        super(5); //2�s�ڂɏ�������G���[
        System.out.println("�R���X�g���N�^Sub()���Ăт���܂����B");
    }                                  // ���V�O�l�`��
}

class SampleConstructorChain01{
    public static void main(String[] args){
        new Sub(); //�C���X�^���X������
    }              //�@�C���X�^���X�����i�Ō�ɎQ�ƒl���t�^�j
}                  //�A�R���X�g���N�^�[���s�i�T�u�N���X�̃R���X�g���N�^�[�����s�j