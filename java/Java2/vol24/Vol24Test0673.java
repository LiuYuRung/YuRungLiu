// 0：Tokyo
// 1：London
// 2：Seoul
// 3：Paris
// 4：Moscow
// ********
// ********
import java.util.ArrayList;
import java.util.List;


class Vol24Test0673{
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
        System.out.println("********");

        list.removeAll(list);//clearメソッドと同じ、list.clear();

        printElements(list);
        System.out.println("********");              
    }
}