/*
 * Filename  : TestMain03.java
 * Author    : Annaka, Satoru
 * Date      : 
 * Remark    : 
 */
//package�������� = �����p�b�P�[�W�ɑ��Ă���
import Protected0.*;

public class TestMain03 {
    public static void main(String[] args) {
        Protected0Class00 p0c00 = new Protected0Class00();
        //p0c00.value = 100;
        //p0c00.sayValue();
        
        ExtendsProtected0Class00 ep0c00 = new ExtendsProtected0Class00();
        //ep0c00.value = 200;//�T�u�N���X�̒�����̃A�N�Z�X�ł͂Ȃ�(�G���[)
        //ep0c00.sayValue();//�T�u�N���X�̒�����̃A�N�Z�X�ł͂Ȃ�(�G���[)
    }
}


class ExtendsProtected0Class00 extends Protected0Class00 {//���ځF�ʂ̃p�b�P�[�W�̃N���X���p�������T�u�N���X
    ExtendsProtected0Class00() {
        //super();���Öق̓��Ɏ��s�����
        System.out.println("ExtendsProtected0Class00 Constractor!!");
        value = 300;//protected�ɂ���Ē��ڃA�N�Z�X�\
        sayValue();//protected�ɂ���Ē��ڃA�N�Z�X�\
    }
}
//End Of File
