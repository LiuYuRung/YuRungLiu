class Vol20Test1157{
    public static void main(String[] args){
        Object x = new String("A");
        switch(x.toString()){
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            case "C":
                System.out.println("C");                                               
        }
    }
}