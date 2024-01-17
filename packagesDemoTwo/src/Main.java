import message.Success;
import message.Error;

public class Main {
    public static void main(String[] args) {
        Success success = new Success();
        Error error = new Error();

        boolean state = false;

        if (state) {
            success.printMessage();
        } else {
            error.printMessage();
        }
    }
}