class Vol04Test2540{
    public static void main(String[] args){
        int i, j;
        for(i = 0, j = 0; i < 3;){
            if(i++ == 2 && j++ == 2)
                break;
        }
        System.out.println(i);
        System.out.println(j);
    }
}