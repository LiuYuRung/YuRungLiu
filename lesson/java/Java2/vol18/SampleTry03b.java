//java.io.IOException: Stream closed
//        at java.base/java.io.BufferedReader.ensureOpen(BufferedReader.java:122)
//        at java.base/java.io.BufferedReader.readLine(BufferedReader.java:319)
//        at java.base/java.io.BufferedReader.readLine(BufferedReader.java:392)
//        at SampleThrows03b.main(SampleThrows03b.java:16)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SampleTry03b{
    public static void main(String[] args){
        BufferedReader br = null;

        try{
            br = new BufferedReader(new InputStreamReader(System.in));

            br.close();

            String line = br.readLine();//意図的にIOExceptionを生じさせるためのコード

            System.out.println(line);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}