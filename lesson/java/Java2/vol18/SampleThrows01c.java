//例外が発生しました。
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SampleThrows01c{
    static String input()throws IOException{

        BufferedReader br 
        = new BufferedReader(new InputStreamReader(System.in));

        br.close();//意図的にIOExceptionを生じさせるためのコード

        String line = br.readLine(); 

        return line;
    }

    public static void main(String[] args){
        try{
            String line = input();

            System.out.println(line); 
        }catch(Exception e){
            System.out.println("例外が発生しました。");
        }               
    }
}