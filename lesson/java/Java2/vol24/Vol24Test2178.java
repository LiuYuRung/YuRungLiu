// 1:高橋
// 3:山田
// 5:田中
// 6:鈴木
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Vol24Test2178{
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(5,"田中");
        map.put(6,"鈴木");
        map.put(3,"山田");
        map.put(1,"高橋");

        Set<Integer> keySet = map.keySet();

        Iterator<Integer> iterator = keySet.iterator();
        while(iterator.hasNext()){
            Integer key = iterator.next();
            System.out.println(key + ":" + map.get(key));
        }           
    }
}