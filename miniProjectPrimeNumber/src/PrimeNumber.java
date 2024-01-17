import java.util.Scanner;

public class PrimeNumber {
    static int number;

    public PrimeNumber() {

    }
    public static void findToPrimeNumber(int value) {
        if (value <= 1) {
            System.out.println("This number is not prime number.");
            return;
        }

        for (int i = 2; i<value; i++) {
            if (value % i == 0) {
                System.out.println("This number is not prime number.");
                return;
            }
        }
        System.out.println("This number is prime number.");
    }

    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number that you want to learn : ");
        number = s.nextInt();

        findToPrimeNumber(number);
    }
}
