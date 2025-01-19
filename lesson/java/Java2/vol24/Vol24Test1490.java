import java.util.HashSet;
import java.util.Iterator;

class Vol24Test1490{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();

        boolean b1, b2, b3, b4;

        b1 = set.add("Toyko"); //true
        b2 = set.add("Paris"); //true
        b3 = set.add("London");//true
        b4 = set.add("Paris"); //false

        System.out.println(b1); //Toyko
        System.out.println(b2); //London
        System.out.println(b3); //Paris
        System.out.println(b4);
        System.out.println();

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }        
    }
}