// Exception in thread "main" java.lang.NullPointerException
//         at Vol20Test1165.foo(Vol20Test1165.java:3)
//         at Vol20Test1165.main(Vol20Test1165.java:10)
class Vol20Test1165{
    static void foo(String str){
        switch(str){
            case "A": System.out.println("A"); break;
            case "null": System.out.println("B"); break;
        }
    }
    public static void main(String[] args){
        String str = null;
        foo(str);
    }
}