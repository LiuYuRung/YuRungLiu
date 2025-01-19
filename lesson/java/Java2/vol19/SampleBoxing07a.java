class SampleBoxing07a{
    static void method(int x){
        System.out.println("method(int)");
    }
    public static void main(String[] args){
        Integer x = new Integer(10);
        method(x);        
    }
}