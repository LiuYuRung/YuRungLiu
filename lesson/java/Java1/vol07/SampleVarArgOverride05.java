class SampleVarArgOverride05{
    static void foo(int...x){
        System.out.println("foo(int...)�̌Ăяo��");
    }
    static void foo(short s1, short s2){
        System.out.println("foo(short, short)�̌Ăяo��");
    }
    public static void main(String[] args){
        short x = 10,y = 20,z = 30;

        foo();
        foo(x);
        foo(x,y);
        foo(x,y,z);
    }
}