class Vol07Test1748{
    public static void main(String args1, String args2){
        System.out.print(args1 + args2);
    }
    public static void main(String[] args){
        main(args[0]);
    }
    public static void main(String args){
        main(args, "X");
    }
}