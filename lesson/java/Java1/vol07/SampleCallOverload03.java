class SampleCallOverload03{
    static void meth(short x, int y){
        System.out.println("meth(int, int)���Ăяo����܂����B");
    }
    static void meth(int x, short y){
        System.out.println("meth(short)���Ăяo����܂����B");
    }
    public static void main(String[] args){
        byte b1 = 1, b2 = 2;
        meth(b1,b2);
    } 
}