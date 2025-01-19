class Vol07Test1200{
    static void foo(int[] a){
        for(int x:a)
        System.out.println(x);
    }
    public static void main(String[] args){
        int[] a = new int[3];
        for(int i = 0; i < a.length; i++)
        a[i] = a[i] + 10;
        foo(a); 
    }
}