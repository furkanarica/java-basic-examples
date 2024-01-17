import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\javademos\\files\\informations.txt");

        try {
            if(file.createNewFile()) {
                System.out.println("File successfully created.");
            } else {
                System.out.println("File was already created.");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}