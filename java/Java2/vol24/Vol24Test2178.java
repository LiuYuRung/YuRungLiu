// 1:����
// 3:�R�c
// 5:�c��
// 6:���
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Vol24Test2178{
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(5,"�c��");
        map.put(6,"���");
        map.put(3,"�R�c");
        map.put(1,"����");

        Set<Integer> keySet = map.keySet();

        Iterator<Integer> iterator = keySet.iterator();
        while(iterator.hasNext()){
            Integer key = iterator.next();
            System.out.println(key + ":" + map.get(key));
        }           
    }
}