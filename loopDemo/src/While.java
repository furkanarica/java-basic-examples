public class While {
    public static void main (String [] args) {
        int number = 1;
        while(number < 10) {
            if(number % 5 == 0) {
                System.out.println(number + " is divisible by 5");
            }
            number++;
        }
    }
}
