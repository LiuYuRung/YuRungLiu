// 0：Tokyo
// 1：Paris
// 2：London
// 3：Seoul
import java.util.ArrayList;

class Vol24Test0461{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();

        list.add("Tokyo");
        list.add("London");
        list.add("Seoul");
        list.add(1,"Paris");


        for(int i = 0; i < list.size(); i++){
            String element = list.get(i);
            System.out.println(i + "：" + element);
        }
    }
}