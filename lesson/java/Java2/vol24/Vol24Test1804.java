// MyClass@34:4
// MyClass@27:3
// MyClass@1a:2
// MyClass@d:1
// ------------------------
// MyClass@34:4
// MyClass@27:3
// MyClass@d:1
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class MyClass{
    int d;
    MyClass(int d){
        this.d = d;
    }
    public int hashCode(){
        return d * 13;
    }
    public boolean equals(Object obj){
        if(obj instanceof MyClass && ((MyClass)obj).d == this.d){
            return true;
        } else {
            return false;
        }
    }
}
class Vol24Test1804{
    public static <E extends MyClass> void printElements(Set<E> set){
        Iterator<E> iterator = set.iterator();
        while(iterator.hasNext()){
            E element = iterator.next();
            System.out.println(element + ":" + element.d);
        }        
    }
    public static void main(String[] args){
        HashSet<MyClass> set = new HashSet<MyClass>();

        set.add(new MyClass(3));
        set.add(new MyClass(1));
        set.add(new MyClass(4));
        set.add(new MyClass(2));

        printElements(set);

        set.remove(new MyClass(2));
        
        System.out.println("------------------------");
        
        printElements(set);
    }
}