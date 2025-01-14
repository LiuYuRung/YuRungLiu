// Toyko
// London
// Paris
import java.util.HashSet;
import java.util.Iterator;

class Vol24Test1466{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();

        set.add("Toyko");
        set.add("Paris");
        set.add("London");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }        
    }
}