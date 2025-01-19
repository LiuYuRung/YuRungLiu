//>>>Hello!
//Hello!
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SampleTry02a{
    public static void main(String[] args){
        BufferedReader br = null;

        try{
            br = new BufferedReader(new InputStreamReader(System.in));

            String line = br.readLine();
            System.out.println(line);
        }catch(IOException e){
            System.out.println("IOExceptionÇ™ê∂Ç∂ÇµÇ‹ÇµÇΩÅB");
        }
    }
}