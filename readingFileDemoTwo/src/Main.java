import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("undefined.txt"));

        try {
            reader.close();
        }
        catch (Exception expection) {
            expection.printStackTrace();
        }
    }
}