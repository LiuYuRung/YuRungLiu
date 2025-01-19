//  Exception in thread "main" java.lang.NumberFormatException: For input string: "120a"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//         at java.base/java.lang.Integer.parseInt(Integer.java:652)      
//         at java.base/java.lang.Integer.parseInt(Integer.java:770)      
//         at SampleWrapper02f.main(SampleWrapper02f.java:5)
class SampleWrapper02f{
    public static void main(String[] args){
        Integer x = Integer.parseInt("120a");            
        System.out.println(x);        
    }
}