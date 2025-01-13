class MyClass{}
class Vol19Test0185{
    public static void foo(Object o){
        System.out.println("foo(Object)");
    }
    public static void foo(MyClass o){
        System.out.println("foo(MyClass)");        
    }
    public static void main(String[] args){
        MyClass mc = new MyClass();
        int[] a = new int[3];
        foo(mc);
        foo(a);
    }
}