//Exception in thread "main" java.io.IOException: Stream closed
//        at java.base/java.io.BufferedReader.ensureOpen(BufferedReader.java:122)
//        at java.base/java.io.BufferedReader.readLine(BufferedReader.java:319)
//        at java.base/java.io.BufferedReader.readLine(BufferedReader.java:392)
//        at SampleThrows01a.main(SampleThrows01a.java:13)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SampleThrows01a{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.close();//意図的にIOExceptionを生じさせるためのコード

        String line = br.readLine(); 

        System.out.println(line);
    }
}