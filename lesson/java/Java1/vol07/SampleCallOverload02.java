class SampleCallOverload02{
    static void meth(int i, int j){
        System.out.println("meth(int, int)���Ăяo����܂����B");
    }
    static void meth(short s){
        System.out.println("meth(short)���Ăяo����܂����B");
    }
    public static void main(String[] args){
        short s1 = 10;
        short s2 = 20;
        int i1 = 100;
        int i2 = 200;

        meth(i1, i2);
        //meth(i1);
        meth(s1, s2);
        meth(s1);
    }
}