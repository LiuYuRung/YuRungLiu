class SampleArray06a{
    public static void main(String[] args){
        // int�^�z��̐錾
        int[] ai;

        // int�^�z��̐���
        ai = new int[5];

        //�e�v�f�ɒl����
        ai[0] = 78;
        ai[1] = 92;
        ai[2] = 80;
        ai[3] = 100;
        ai[4] = 55;

        //�v�f�̈ꗗ�\��
        for (int i = 0; i < 5; i++) {
            System.out.println("ai[" + i + "] = " + ai[i]);
        }
    }
}