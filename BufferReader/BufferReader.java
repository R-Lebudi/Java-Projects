package bufferreader;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader {

    public static void main(String[] args) throws Exception {
        FileReader file = new FileReader("C:/Users/M LU/My Documents/BufferReader from this.txt");
        BufferedReader reader = new BufferedReader(file);
        
        String text = "";
        String line = reader.readLine();
        
        while(line != null){
            text += line;
            line = reader.readLine();
        }
        System.out.println(text);
    }    
}
