class Vol04Test0931{
    public static void main(String[] args){
        byte b = 0;
        switch(b) {
            case -128: System.out.print("A"); break;
            case 0: System.out.print("B"); break;
            case 128: System.out.print("C"); break;
            default: System.out.print("D"); break;
        }
    }
}