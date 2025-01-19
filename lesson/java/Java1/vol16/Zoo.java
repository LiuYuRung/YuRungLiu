abstract class Zoo{
    int x;
    static int y;

    Zoo(){
        System.out.println("Zoo()");
    }

    void foo(){
        System.out.println("Zoo#foo()");
    }

    static void bar(){
        System.out.println("Zoo#bar()");
    }

    abstract void hoge();
}