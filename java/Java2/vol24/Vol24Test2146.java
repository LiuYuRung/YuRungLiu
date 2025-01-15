// Yamada
// 要素数：4
// Sato
// 要素数：4
import java.util.HashMap;

class Vol24Test2146{
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(5,"Tanaka");
        map.put(6,"Suzuki");
        map.put(3,"Yamada");
        map.put(1,"Takahashi");

        System.out.println(map.get(3));
        System.out.println("要素数："+ map.size());

        map.put(3,"Sato");//更新

        System.out.println(map.get(3));
        System.out.println("要素数："+ map.size());
        
    }
}