// Total JVM memory:264241152
// Before memory:256908800
// After memory:256384512
// After GC memory:256384512
import java.util.Date;
public class CheckGC{
    public static void main(String[] args){
        Runtime rt = Runtime.getRuntime();
        System.out.println(("Total JVM memory:") + rt.totalMemory());
        System.out.println(("Before memory:") + rt.freeMemory());
        Date d = null;
        for(int i = 0; i < 10000; i++){
            d = new Date();
            d = null;
        }
        System.out.println(("After memory:") + rt.freeMemory());  //Syste.gc();と同じ
        System.out.println(("After GC memory:") + rt.freeMemory());
    }
}