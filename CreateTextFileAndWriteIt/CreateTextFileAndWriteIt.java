package createtextfileandwriteit;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateTextFileAndWriteIt {

    public static void main(String[] args) {
        
        try {     
            File file = new File("manlu.txt");
        
            if (!file.exists()){
                file.createNewFile();
                }
            // creating an object of PrintWriter
            // the println will be the content of the file
            // when working with files, you need to close() the file
            // DONE is to show that the program has executed successfully
            // To find the location of the project. Right click the project, Go to properties & copy the path & then paste the path on your folder explorer & press enter 
            PrintWriter pw = new PrintWriter(file);
            pw.println("ERENG MARKETING NTWANA!!!");
            pw.close();
            System.out.println("Done");
            } 
        catch (IOException ex) {
                Logger.getLogger(CreateTextFileAndWriteIt.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
}
