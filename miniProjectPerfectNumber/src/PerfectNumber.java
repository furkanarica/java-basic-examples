import java.util.Scanner;

public class PerfectNumber {
    static int number;

    public PerfectNumber() {

    }
    public static void sumToElements(int [] array, int number) {
        int sum=0;
        for (int element:array) {
            sum+=element;
        }

        if (sum == number) {
            System.out.println("This number is perfect number.");
        } else {
            System.out.println("This number is not perfect number.");
        }
    }
    public static void isPerfect(int value) {
        int [] aliquots = new int[10];

        if (number < 6) {
            System.out.println("This number is not perfect number.");
            return;
        }

        int j = 0;
        for (int i =1; i<value; i++) {
            if (value % i == 0) {
                aliquots[j] = i;
                j++;
            }
        }
        sumToElements(aliquots,value);
    }

    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number that you want to learn :");
        number = s.nextInt();

        isPerfect(number);
    }
}
