// 0�FTokyo
// 1�FVol24Test0534@66133adc
// 2�F12
// 3�Ftrue
import java.util.ArrayList;

class Vol24Test0534{
    public static void main(String[] args){
        ArrayList list = new ArrayList(); //�^�������w�肵�Ȃ�

        list.add("Tokyo");
        list.add(new Vol24Test0534());
        list.add(12);
        list.add(true);
        //ArrayList�^�̗v�f�̌^��Object�^,�C�ӂ̃f�[�^��v�f�ɑ���\

        for(int i = 0; i < list.size(); i++){
            Object element = list.get(i); 
            System.out.println(i + "�F" + element);
        }
    }
}