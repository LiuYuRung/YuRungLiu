class Switch{
    public static void main(String[] args){
        String season = args[0];
        switch(season){
            case "Spring":
                System.out.println("t");
                break;
            case "Summer":
                System.out.println("‰Ä");
                break;
            case "Autumn":
                System.out.println("H");
                break;
            case "Winter":
                System.out.println("“~");
                break;
            default:
                System.out.println("‚»‚Ì‘¼");                                                
        }
    }
}