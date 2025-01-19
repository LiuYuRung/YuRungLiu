// Toyko
// Paris
// London
// Moscow
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

class Vol24Test1871{
    public static <E> void printElements(Set<E> set){
        Iterator<E> iterator = set.iterator();
        while(iterator.hasNext()){
            E element = iterator.next();
            System.out.println(element);
        }        
    }
    public static void main(String[] args){
        LinkedHashSet<String> set = new LinkedHashSet<String>();

        set.add("Toyko");
        set.add("Paris");
        set.add("London");
        set.add("Moscow");
        
        printElements(set);
      
    }
}