public class ExampleOne {
    public static int multiplyNumbers(int... numbers) {
        int total = 1;
        for (int number:numbers) {
            total*=number;
        }
        return total;
    }

    public static void main (String [] args) {
        int result = multiplyNumbers(5,3,4,9,10);
        System.out.println("Result : " + result);
    }
}
