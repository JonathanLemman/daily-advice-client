import java.net.*;
import java.io.*;

public class DailyAdviceClient {

    public void go() {
        try {
            // make a socket connection to server host and port of server app
            Socket s = new Socket("127.0.0.1", 4242);

            // chain a BufferedReader to an InputStreamReader to the input stream from the Socket
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

            // this readLine() is the same as using BufferedReader to read a file that it's chained to
            String advice = reader.readLine();
            System.out.println("Today you should: " + advice);

            // this closes all the streams
            reader.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public static void main(String[] args) {

        DailyAdviceClient client =  new DailyAdviceClient();
        client.go();
    }



}
