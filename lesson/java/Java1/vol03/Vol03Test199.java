class Vol03Test199{
    public static void main(String[] args){
        int a = 11, b = 22, r1, r2;
        a++;
        r1 = ++a;
        r2 = b--;
        --b;
        System.out.print(a + ":" + r2); 
    }
}