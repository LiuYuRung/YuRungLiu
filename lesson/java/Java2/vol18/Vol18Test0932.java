//catch
//end
class Vol18Test0932{
    public static void main(String[] args){
        int[] a = {10,20,30};
        try{
            a[3] = 0;
            System.out.println("try");
        }catch(Exception e){
            System.out.println("catch");
        }
        System.out.println("end");
    }
}