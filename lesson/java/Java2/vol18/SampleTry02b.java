//IOException���������܂����B
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SampleTry02b{
    public static void main(String[] args){
        BufferedReader br = null;

        try{
            br = new BufferedReader(new InputStreamReader(System.in));

            br.close();//�Ӑ}�I��IOException�𐶂������邽�߂̃R�[�h

            String line = br.readLine();

            System.out.println(line);
        }catch(IOException e){
            System.out.println("IOException���������܂����B");
        }
    }
}