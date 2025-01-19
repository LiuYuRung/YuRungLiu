// MyClass@59f95c5d:3
// MyClass@6a6824be:3
// MyClass@7960847b:2
// MyClass@4aa8f0b4:4
// MyClass@5ccd43c2:1
import java.util.HashSet;
import java.util.Iterator;

class MyClass{
    int d;
    MyClass(int d){
        this.d = d;
    }
/*    
    public int hashCode(){
        return d * 13;
    }
*/
    public boolean equals(Object obj){
        if(obj instanceof MyClass && ((MyClass)obj).d == this.d){
            return true;
        } else {
            return false;
        }
    }
}
class Vol24Test1624{
    public static void main(String[] args){
        HashSet<MyClass> set = new HashSet<MyClass>();

        set.add(new MyClass(3));
        set.add(new MyClass(1));
        set.add(new MyClass(4));
        set.add(new MyClass(2));
        set.add(new MyClass(3));

        Iterator<MyClass> iterator = set.iterator();
        while(iterator.hasNext()){
            MyClass element = iterator.next();
            System.out.println(element + ":" + element.d);
        }        
    }
}