import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        ListingThread threadOne = new ListingThread("threadOne");
        ListingThread threadTwo = new ListingThread("threadTwo");

        threadOne.start();
        threadTwo.start();
    }
}