// Exception in thread "main" java.lang.NumberFormatException: For input string: "10a"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//         at java.base/java.lang.Integer.parseInt(Integer.java:652)      
//         at java.base/java.lang.Integer.valueOf(Integer.java:983)       
//         at SampleWrapper02d.main(SampleWrapper02d.java:4)
class SampleWrapper02d{
    public static void main(String[] args){
        Integer x = Integer.valueOf("10a");        
        System.out.println(x);
    }
}