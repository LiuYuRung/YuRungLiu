// Total JVM memory:264241152
// Before memory:260122016
// After memory:260122016
// After GC memory:11689000
import java.util.Date;

class Vol22Test0578{
    public static void main(String[] args){
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total JVM memory:" + rt.totalMemory());
        System.out.println("Before memory:" + rt.freeMemory());

        Date d = null;
        for(int i = 0; i < 10000; i++){
            d = new Date();
            d = null;
        }
        System.out.println("After memory:" + rt.freeMemory());
        rt.gc();
        System.out.println("After GC memory:" + rt.freeMemory());
    }
}