//catch1
//end
class Vol18Test0940{
    public static void main(String[] args){
        int x = 2,y = 0;
        try{
            int result = x/y;
            System.out.println("try");
        }catch(ArithmeticException e){
            System.out.println("catch1");
        }catch(Exception e){
            System.out.println("catch2");
        }
        System.out.println("end");
    }
}