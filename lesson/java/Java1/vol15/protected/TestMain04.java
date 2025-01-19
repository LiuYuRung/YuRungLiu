/*
 * Filename  : TestMain04.java
 * Author    : Annaka, Satoru
 * Date      : 
 * Remark    : 
 */

import Protected1.*;

public class TestMain04 {
    public static void main(String[] args) {
        
        ExtendsProtected1Class00 ep0c00 = new ExtendsProtected1Class00(400);
    }
}


class ExtendsProtected1Class00 extends Protected1Class00 {
    private int value;
    
    ExtendsProtected1Class00(int v) {
        System.out.println("ExtendsProtected1Class00 Constractor!!");
        value = v;
        System.out.println("value : " + value);
        sayValue();
    }
}
//End Of File
