package bufferreaderusingexceptionhandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import static java.lang.System.*;

public class BufferReaderUsingExceptionHandling {

    public static void main(String[] args) throws Exception{
        try{
        FileWriter fw = new FileWriter("DIT3yrsJava.txt");
        PrintWriter pw = new PrintWriter(fw);
        
        pw.println("Course: 20 credits");
        pw.println("Year: 120 credits");
        pw.println("Diploma: 300 credits");
        
        pw.close();
        }
        catch (IOException e){
            out.println("ERROR");
        }
    }
}
