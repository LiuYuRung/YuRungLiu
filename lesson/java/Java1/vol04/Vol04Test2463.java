class Vol04Test2463{
    public static void main(String[] args){
        int x = 1;
        do{
            if(x++ / 2 == 1){
                continue;
            }
            System.out.print(++x + " ");
        }while ( x <= 10);
    }
}