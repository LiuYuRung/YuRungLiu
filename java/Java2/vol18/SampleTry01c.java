//�[�����Z����܂����B
//�v���O�����̏I���ł�
class SampleTry01c{
    public static void main(String[] args){
        int a, b, result;

        try{
            a = 5;
            b = 0;

            result = a / b;

            System.out.println("a / b = " + result);
        }catch(ArithmeticException ae){
            System.out.println("�[�����Z����܂����B");
        }finally{
            System.out.println("�v���O�����̏I���ł�");
        }        
    }
}