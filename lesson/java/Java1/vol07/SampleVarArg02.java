class SampleVarArg02{
    static void foo(double d,int...x){
        System.out.println("foo(double,int..)‚ÌŒÄ‚Ño‚µB");
    }
    public static void main(String[] args){
        int x = 10, y = 20, z = 30;

        //foo();
        foo(x);
        foo(x,y);
        foo(x,y,z);
    }
}