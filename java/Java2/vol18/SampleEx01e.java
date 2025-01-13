//Exception in thread "main" java.io.IOException: Stream closed
//        at java.base/java.io.BufferedReader.ensureOpen(BufferedReader.java:122)
//        at java.base/java.io.BufferedReader.readLine(BufferedReader.java:319)
//        at java.base/java.io.BufferedReader.readLine(BufferedReader.java:392)
//        at SampleEx01e.main(SampleEx01e.java:12)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SampleEx01e{
    public static void main(String[] args) throws IOException{
        BufferedReader br
        = new BufferedReader(new InputStreamReader(System.in));

        br.close();

        String line = br.readLine();
        System.out.println(line);
    }
}