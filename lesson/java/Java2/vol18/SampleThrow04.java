//MyException: ���̔N��͎w��ł��܂���B
//        at SampleThrow04.getResult(SampleThrow04.java:16)
//        at SampleThrow04.main(SampleThrow04.java:23)
//�v���O�����I���ł�
class MyException extends Exception{
    public MyException(){
        super();
    }
    public MyException(String msg){
        super(msg);
    }
}
class SampleThrow04{
    static void getResult(int age) throws MyException{
        if(age >= 20){
            System.out.println("���l�ł��B");
        }else if(age >= 0){
            System.out.println("�����N�ł��B");
        }else{
            throw new MyException("���̔N��͎w��ł��܂���B");
        }
    }
    public static void main(String[] args){
        int age = -1;

        try{
            getResult(age);
        }catch(MyException e){
            e.printStackTrace();
        }
        System.out.println("�v���O�����I���ł��B");
    }
}