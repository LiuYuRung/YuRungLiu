interface If1{
    public default void foo(){
        System.out.println("If1#foo");
    }
}
interface If2{
    public default void foo(){
        System.out.println("If2#foo");
    }
}
//このクラス定義はコンパイルエラー
class MyClass implements If1, If2{
}