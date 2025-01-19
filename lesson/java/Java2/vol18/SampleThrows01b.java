//Exception in thread "main" java.io.IOException: Stream closed
//        at java.base/java.io.BufferedReader.ensureOpen(BufferedReader.java:122)
//        at java.base/java.io.BufferedReader.readLine(BufferedReader.java:319)
//        at java.base/java.io.BufferedReader.readLine(BufferedReader.java:392)
//        at SampleThrows01b.input(SampleThrows01b.java:17)
//        at SampleThrows01b.main(SampleThrows01b.java:23)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SampleThrows01b{
    static String input()throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.close();//意図的にIOExceptionを生じさせるためのコード

        String line = br.readLine(); 

        return line;
    }

    public static void main(String[] args)throws IOException{
        String line = input();

        System.out.println(line);        
    }
}