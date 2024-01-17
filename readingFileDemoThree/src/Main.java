import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;

        try{
            reader = new BufferedReader
                    (new FileReader("D:\\javademos\\readingFileDemoThree\\src\\numbers.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                if((Integer.parseInt(line)) % 2 == 0) {
                    System.out.println(line);
                }
            }
        }
        catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
        finally {
            reader.close();
        }
    }
}