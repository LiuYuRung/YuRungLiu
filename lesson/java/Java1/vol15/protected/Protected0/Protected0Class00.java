/*
 * Filename  : Protected0Class00.java
 * Author    : Annaka, Satoru
 * Date      : 
 * Remark    : 
 */

package Protected0;

public class Protected0Class00 {
    protected int value;//注目
    
    public Protected0Class00() {
        System.out.println("Protected1Class00 Constractor!!");
    }
    
    protected void sayValue() {
        System.out.println("value : " + value);
    }

    //動作チェック用(テストドライバ)
    public static void main(String[] args) {
        Protected0Class00 p0c00 = new Protected0Class00();//
        p0c00.value = 100;
        p0c00.sayValue();
    }
}
//End Of File
