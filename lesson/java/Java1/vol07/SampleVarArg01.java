class SampleVarArg01{
    static void foo(int...x){
        System.out.println("foo(int..)の呼び出し。");
    }
    public static void main(String[] args){
        int x = 10, y = 20, z = 30;

        foo();
        foo(x);
        foo(x,y);
        foo(x,y,z);
        
    }
}