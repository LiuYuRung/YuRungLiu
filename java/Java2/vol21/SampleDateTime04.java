// 2024-12-11T07:56:29.366445600
// 2024-12-11
// 2024/12/11 07:56:29
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class SampleDateTime04{
    public static void main(String[] args){
        //�f�t�H���g�������m�F
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        //ISO�ŋK�肳��Ă�������̏����Ńt�H�[�}�b�g
        DateTimeFormatter fmt1 = DateTimeFormatter.ISO_DATE;
        System.out.println(fmt1.format(dt));

        //�Ǝ��̓����̏����Ńt�H�[�}�b�g
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(fmt2.format(dt));        
    }
}