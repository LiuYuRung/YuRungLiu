class SampleVarArgOverride04{
    static void foo(int...x){
        System.out.println("foo(int...)�̌Ăяo��");
    }
    static void foo(short s){
        System.out.println("foo(short)�̌Ăяo��");
    }
    public static void main(String[] args){
        byte x = 10, y = 20, z = 30;

        foo();
        foo(x);
        foo(x,y);
        foo(x,y,z);
    }
}