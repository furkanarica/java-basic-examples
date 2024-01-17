import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[] {5,15,20};

        try {
            array[3] = 30;
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
        finally {
            System.out.println("Finally block work every time.");
        }

        System.out.println("Program continues.");
    }
}