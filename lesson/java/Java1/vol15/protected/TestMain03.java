/*
 * Filename  : TestMain03.java
 * Author    : Annaka, Satoru
 * Date      : 
 * Remark    : 
 */
//package文が無い = 無名パッケージに属ている
import Protected0.*;

public class TestMain03 {
    public static void main(String[] args) {
        Protected0Class00 p0c00 = new Protected0Class00();
        //p0c00.value = 100;
        //p0c00.sayValue();
        
        ExtendsProtected0Class00 ep0c00 = new ExtendsProtected0Class00();
        //ep0c00.value = 200;//サブクラスの中からのアクセスではない(エラー)
        //ep0c00.sayValue();//サブクラスの中からのアクセスではない(エラー)
    }
}


class ExtendsProtected0Class00 extends Protected0Class00 {//注目：別のパッケージのクラスを継承したサブクラス
    ExtendsProtected0Class00() {
        //super();が暗黙の内に実行される
        System.out.println("ExtendsProtected0Class00 Constractor!!");
        value = 300;//protectedによって直接アクセス可能
        sayValue();//protectedによって直接アクセス可能
    }
}
//End Of File
