//IOExceptionが生じしました。
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SampleTry02b{
    public static void main(String[] args){
        BufferedReader br = null;

        try{
            br = new BufferedReader(new InputStreamReader(System.in));

            br.close();//意図的にIOExceptionを生じさせるためのコード

            String line = br.readLine();

            System.out.println(line);
        }catch(IOException e){
            System.out.println("IOExceptionが生じしました。");
        }
    }
}