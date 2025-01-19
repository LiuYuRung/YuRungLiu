// 0：Tokyo
// 1：London
// 2：Seoul
// 3：Paris
// 4：Moscow

// 0：Tokyo
// 1：London
// 2：Seoul
// 3：Moscow

// 0：Tokyo
// 1：London
// 2：Seoul
// 3：Moscow
import java.util.ArrayList;
import java.util.List;


class Vol24Test0620{
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

        list.remove("Paris");

        printElements(list);
        System.out.println();

        list.remove("Paris");//Parisは存在しない、falseを返す

        printElements(list);
        System.out.println();                
    }
}