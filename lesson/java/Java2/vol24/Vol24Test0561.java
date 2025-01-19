// 0：Tokyo
// 1：London
// 2：Seoul
// 3：Paris
// 4：Moscow

// 0：Tokyo
// 1：Seoul
// 2：Paris
// 3：Moscow

// 0：Seoul
// 1：Paris
// 2：Moscow
import java.util.ArrayList;
import java.util.List;


class Vol24Test0561{
    public static <E> void printElements(List<E> list){
        for(int i = 0; i < list.size(); i++){
            E element = list.get(i);
            System.out.println(i + "：" + element);
        }
    }
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();

        list.add("Tokyo");
        list.add("London");
        list.add("Seoul");
        list.add("Paris");
        list.add("Moscow");
        
        printElements(list);
        System.out.println();

        list.remove(1);

        printElements(list);
        System.out.println();

        list.remove(0);

        printElements(list);
        System.out.println();                
    }
}