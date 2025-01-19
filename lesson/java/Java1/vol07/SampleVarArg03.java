class SampleVarArg03{
    static void foo(int...x){
        System.out.println("var-arg‚Åó‚¯æ‚Á‚½ˆø”‚Ì” = " + x.length);
    }
    public static void main(String[] args){
        int x = 10,y = 20, z = 30;
        foo();
        foo(x);
        foo(x, y);
        foo(x, y, z);
    }
}