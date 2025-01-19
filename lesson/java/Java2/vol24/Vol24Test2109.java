// Tanaka
// Takahashi
import java.util.HashMap;

class Vol24Test2109{
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(5,"Tanaka");
        map.put(6,"Suzuki");
        map.put(3,"Yamada");
        map.put(1,"Takahashi");

        String value1 = map.get(5);
        System.out.println(value1);

        String value2 = map.get(1);
        System.out.println(value2);
        
    }
}