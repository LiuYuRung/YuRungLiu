// 2017-12-25
// 2018-12-25
// 2019-01-25
// 2019-01-26
import java.time.LocalDate;

class SampleDateTime05{
    public static void main(String[] args){
        //2017/12/25��ێ�����LocalDate�N���X�̃C���X�^���X�𐶐�
        LocalDate date = LocalDate.of(2017,12,25);
        System.out.println(date);

        //1�N�����₷
        date = date.plusYears(1);
        System.out.println(date);

        //1�������₷
        date = date.plusMonths(1);
        System.out.println(date);

        //1�������₷
        date = date.plusDays(1);
        System.out.println(date);  
    }
}