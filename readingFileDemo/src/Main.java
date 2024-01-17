import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader
                    (new FileReader("D:\\javademos\\readingFileDemo\\src\\informations.txt"));
        }
        catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        finally {
            reader.close();
        }
    }
}