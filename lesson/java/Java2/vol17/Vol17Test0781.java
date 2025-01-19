interface SpIf{
    public void foo(){
        System.out.println("SpIf#foo");
    }
}
interface SubIf extends SpIf{
    public static void foo(){
        System.out.println("SubIf#foo");
    }
}