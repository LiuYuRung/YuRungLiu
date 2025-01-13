// [Java, C, Ruby]
// [Java, C, Ruby, PHP]
import java.util.ArrayList;
import java.util.List;

class Vol24Test0828{
    public static void foo(List<String> list){
        list.add("PHP");
    }
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("C");
        list.add("Ruby");

        System.out.println(list);

        foo(list);

        System.out.println(list);
        
    }
}