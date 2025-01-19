//MyException: 負の年齢は指定できません。
//        at SampleThrow04.getResult(SampleThrow04.java:16)
//        at SampleThrow04.main(SampleThrow04.java:23)
//プログラム終了です
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
            System.out.println("成人です。");
        }else if(age >= 0){
            System.out.println("未成年です。");
        }else{
            throw new MyException("負の年齢は指定できません。");
        }
    }
    public static void main(String[] args){
        int age = -1;

        try{
            getResult(age);
        }catch(MyException e){
            e.printStackTrace();
        }
        System.out.println("プログラム終了です。");
    }
}