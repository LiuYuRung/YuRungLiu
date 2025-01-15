// Toyko
// London
// Seoul
// Paris
// Moscow
import java.util.ArrayList;
import java.util.Iterator;

class Vol24Test0756{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();

        list.add("Toyko");
        list.add("London");
        list.add("Seoul");
        list.add("Paris");
        list.add("Moscow");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }        
    }
}