class SampleArray09{
    public static void main(String[] args){
        //2�����z��̐錾�E����
        int[][] array = new int[2][3];

        //�e�v�f�ɒl����
        array[0][0] = 11;
        array[0][1] = 12;
        array[0][2] = 13;
        array[1][0] = 21;
        array[1][1] = 22;
        array[1][2] = 23;

        //�e�v�f��\��
        System.out.println("array[0][0] = " + array[0][0]);
        System.out.println("array[0][1] = " + array[0][1]);
        System.out.println("array[0][2] = " + array[0][2]);
        System.out.println("array[1][0] = " + array[1][0]);
        System.out.println("array[1][1] = " + array[1][1]);
        System.out.println("array[1][2] = " + array[1][2]);

    }
}