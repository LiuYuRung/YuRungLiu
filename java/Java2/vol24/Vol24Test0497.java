// 0�FTokyo
// 1�FLondon
// 2�FSeoul
import java.util.ArrayList;

class Vol24Test0497{
    public static void main(String[] args){
        ArrayList list = new ArrayList(); //�^�������w�肵�Ȃ�

        list.add("Tokyo");
        list.add("London");
        list.add("Seoul");


        for(int i = 0; i < list.size(); i++){
            String element = (String)list.get(i); //�߂�l��Object�^�A�_�E���L���X�g���K�v
            System.out.println(i + "�F" + element);
        }
    }
}