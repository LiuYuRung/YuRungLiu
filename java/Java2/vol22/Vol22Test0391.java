class MyClass{
    public void finalize() throws Throwable{
        System.out.println("GC�ɂ���ăC���X�^���X��������܂�");
    }
}
class Vol22Test0391{
    public static void main(String[] args){
        MyClass m = new MyClass();
        m = null;    //�C���X�^���X��GC�̑Ώۂɂ���
        System.gc();

        //���ԉ҂������鏈��
        for(int i = 0; i <= 100; i++){
            System.out.print(i + " ");
        }
    }
}