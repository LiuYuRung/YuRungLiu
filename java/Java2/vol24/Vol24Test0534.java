// 0：Tokyo
// 1：Vol24Test0534@66133adc
// 2：12
// 3：true
import java.util.ArrayList;

class Vol24Test0534{
    public static void main(String[] args){
        ArrayList list = new ArrayList(); //型引数を指定しない

        list.add("Tokyo");
        list.add(new Vol24Test0534());
        list.add(12);
        list.add(true);
        //ArrayList型の要素の型はObject型,任意のデータを要素に代入可能

        for(int i = 0; i < list.size(); i++){
            Object element = list.get(i); 
            System.out.println(i + "：" + element);
        }
    }
}