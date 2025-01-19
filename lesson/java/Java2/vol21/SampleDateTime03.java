// 2017-07-12
// 10:12:54
// 2017-07-12T10:12:54
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class SampleDateTime03{
    public static void main(String[] args){
        LocalDate date = LocalDate.parse("2017-07-12");
        LocalTime time = LocalTime.parse("10:12:54");
        LocalDateTime datetime = LocalDateTime.parse("2017-07-12T10:12:54");

        System.out.println(date);
        System.out.println(time);
        System.out.println(datetime);
    }
}