class SampleVarArgOverride04{
    static void foo(int...x){
        System.out.println("foo(int...)‚ÌŒÄ‚Ño‚µ");
    }
    static void foo(short s){
        System.out.println("foo(short)‚ÌŒÄ‚Ño‚µ");
    }
    public static void main(String[] args){
        byte x = 10, y = 20, z = 30;

        foo();
        foo(x);
        foo(x,y);
        foo(x,y,z);
    }
}