public class PaymentInsufficientExpection extends Exception {
    String message;
    public PaymentInsufficientExpection(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
