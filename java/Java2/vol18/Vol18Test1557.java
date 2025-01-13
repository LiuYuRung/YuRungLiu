class Vol18Test1557{
    public static void main(String[] args){
        try{
            int x = 3;
            int y = 0;
            int z = x/y;
            System.out.println("try");
        }catch(Exception e){
            System.out.println("Exception");
            return;
        }
        System.out.println("end");
    }
}