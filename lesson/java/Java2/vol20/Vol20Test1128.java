// Exception in thread "main" java.lang.NullPointerException
//         at Vol20Test1128.main(Vol20Test1128.java:5)
class Vol20Test1128{
    public static void main(String[] args){
        String str = null;

        switch(str){
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break; 
        }                
    }
}