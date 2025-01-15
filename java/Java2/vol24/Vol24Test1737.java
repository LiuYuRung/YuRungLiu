
import java.util.HashSet;
import java.util.Iterator;

class Vol24Test1737{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();

        set.add("Toyko");
        set.add("Paris");
        set.add("London");
        set.add("Moscow");

        System.out.println(set.contains("Paris")); //true        
        System.out.println(set.contains("Seoul")); //false       
    }
}