package ExceptionHandling;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
public class FileNotFoundExceptionExample{
     
    private static final String filename = "input.txt";
     
    public static void main(String[] args) {
        BufferedWriter wr = null;
        try {
            wr = new BufferedWriter(new FileWriter(new File(filename), true));
             
            wr.write("A sample string to be written at the end of the file!\n");
        }
        catch(IOException ex) {
            System.err.println("An IOException was caught!");
            ex.printStackTrace();
        }
        finally {
            try {
                wr.close();
            }
            catch (IOException ex) {
                System.err.println("An IOException was caught!");
                ex.printStackTrace();
            }
        }
    }
}

