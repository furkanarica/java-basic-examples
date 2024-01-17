import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        try {
            division(1,0);
        }
        catch (ClassCastException exception) {
            System.out.println("This expection is a class cast expection.");
        }
        catch (ArithmeticException exception) {
            System.out.println("This expection is an arithmetic expection.");
        }
        catch (Exception exception) {
            System.out.println("Expection");
        }
        finally {
            System.out.println("Finally");
        }
    }
    public static double division(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }


}