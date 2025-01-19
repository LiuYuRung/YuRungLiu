// 0：Tokyo
// 1：London
// 2：Seoul
import java.util.ArrayList;

class Vol24Test0497{
    public static void main(String[] args){
        ArrayList list = new ArrayList(); //型引数を指定しない

        list.add("Tokyo");
        list.add("London");
        list.add("Seoul");


        for(int i = 0; i < list.size(); i++){
            String element = (String)list.get(i); //戻り値はObject型、ダウンキャストが必要
            System.out.println(i + "：" + element);
        }
    }
}