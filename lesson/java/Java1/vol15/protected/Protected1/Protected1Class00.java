/*
 * Filename  : Protected1Class00.java
 * Author    : Annaka, Satoru
 * Date      : 
 * Remark    : 
 */

package Protected1;

public class Protected1Class00 {
    protected int value;
    
    public Protected1Class00() {
        System.out.println("Protected1Class00 Constractor!!");
    }
    
    protected void sayValue() {
        System.out.println("value : " + value);
    }

    //動作チェック用(テストドライバ)
    public static void main(String[] args) {
        Protected1Class00 p1c00 = new Protected1Class00();
        p1c00.value = 100;
        p1c00.sayValue();
    }
}
//End Of File
