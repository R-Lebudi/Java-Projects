package bufferreaderusingexceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import static java.lang.System.*;

public class InRead {
    public static void main(String[] args) throws Exception{
        try{
        FileReader fr = new FileReader("DIT3yrsJava.txt");
        BufferedReader br = new BufferedReader(fr);
        
        String str;
        while ((str = br.readLine()) != null){
            out.println(str + "\n");
            }
        br.close();
        }
        catch (IOException e){
            out.println("File not found");
        }
    }
}
