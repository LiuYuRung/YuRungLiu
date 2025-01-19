class SampleVarArgOverride03{
    static void foo(int...x){
        System.out.println("foo(int...)‚ÌŒÄ‚Ño‚µ");
    }
    static void foo(int i){
        System.out.println("foo(int)‚ÌŒÄ‚Ño‚µ");
    }
    public static void main(String[] args){
        int x = 10, y = 20, z = 30;

        foo();
        foo(x);
        foo(x,y);
        foo(x,y,z);
    }
}