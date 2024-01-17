import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\javademos\\files\\names.txt");
        createFile(file);
        readFile(file);
        writeFile();
        readFile(file);
    }
    public static void createFile(File file) {
        try {
            if(file.createNewFile()) {
                System.out.println("File that named " +file.getName() + " successfully created.");
            } else {
                System.out.println("File that named " +file.getName() + " already created.");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    public static void readFile(File file) {
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }
    public static void writeFile() {
        try {
            FileWriter fileWriter = new FileWriter("D:\\javademos\\files\\names.txt",true);
            fileWriter.write("İstanbul");
            System.out.println("Writing operation complated.");
            fileWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}