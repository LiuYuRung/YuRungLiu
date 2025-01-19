class Vol08Test0415{
    static int[] a;
    static void foo(){
        a = new int[3];
    }
    public static void main(String[] args){
        foo();
        System.out.println(a[0]);
    }
}