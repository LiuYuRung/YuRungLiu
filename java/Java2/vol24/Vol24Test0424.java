// 0�FTokyo
// 1�FLondon
// 2�FSeoul
import java.util.ArrayList;

class Vol24Test0424{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();

        list.add("Tokyo");
        list.add("London");
        list.add("Seoul");

        for(int i = 0; i < list.size(); i++){
            String element = list.get(i);
            System.out.println(i + "�F" + element);
        }
    }
}