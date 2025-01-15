// Toyko
// Seoul
// London
// Paris
// ------------------------
// Toyko
// Seoul
// Paris
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Vol24Test1760{
    public static <E> void printElements(Set<E> set){
        Iterator<E> iterator = set.iterator();
        while(iterator.hasNext()){
            E element = iterator.next();
            System.out.println(element);
        }        
    }
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();

        set.add("Toyko");
        set.add("Paris");
        set.add("London");
        set.add("Seoul");
        
        printElements(set);

        set.remove("London");
        
        System.out.println("------------------------");
        
        printElements(set);
      
    }
}