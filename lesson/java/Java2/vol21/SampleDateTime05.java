// 2017-12-25
// 2018-12-25
// 2019-01-25
// 2019-01-26
import java.time.LocalDate;

class SampleDateTime05{
    public static void main(String[] args){
        //2017/12/25を保持するLocalDateクラスのインスタンスを生成
        LocalDate date = LocalDate.of(2017,12,25);
        System.out.println(date);

        //1年分増やす
        date = date.plusYears(1);
        System.out.println(date);

        //1月分増やす
        date = date.plusMonths(1);
        System.out.println(date);

        //1日分増やす
        date = date.plusDays(1);
        System.out.println(date);  
    }
}