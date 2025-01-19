// 2024-12-11
// 07:44:01.255973900
// 2024-12-11T07:44:01.255973900
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class SampleDateTime01{
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime datetime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(datetime);
    }
}