// 0�FTokyo
// 1�FLondon
// 2�FSeoul
// 3�FParis
// 4�FMoscow

// 0�FTokyo
// 1�FLondon
// 2�FSeoul
// 3�FMoscow

// 0�FTokyo
// 1�FLondon
// 2�FSeoul
// 3�FMoscow
import java.util.ArrayList;
import java.util.List;


class Vol24Test0620{
    public static <E> void printElements(List<E> list){
        for(int i = 0; i < list.size(); i++){
            E element = list.get(i);
            System.out.println(i + "�F" + element);
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

        list.remove("Paris");//Paris�͑��݂��Ȃ��Afalse��Ԃ�

        printElements(list);
        System.out.println();                
    }
}