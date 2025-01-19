//catch
//finally
//end
class Vol18Test0937{
    public static void main(String[] args){
        int[] a = {10,20,30};
        try{
            a[3] = 0;
            System.out.println("try");
        }catch(Exception e){
            System.out.println("catch");
        }finally{
            System.out.println("finally");
        }
        System.out.println("end");
    }
}