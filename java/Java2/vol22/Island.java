class Island{
    Island i;
    public static void main(string[] args){
        Island i2 = new Island();
        Island i3 = new Island();
        Island i4 = new Island();

        i2.i = i3;  //i2.i��i3���Q�Ƃ���
        i3.i = i4;  //i3.i��i4���Q�Ƃ���
        i4.i = i2;  //i4.i��i2���Q�Ƃ���

        i2 = null;
        i3 = null;
        i4 = null;

        //�����������[���ʂɏ����R�[�h
    }
}