public class ProductManager {
    private int price;

    public ProductManager(int price) {
        this.price = price;
    }

    public void sell(int paid) throws PaymentInsufficientExpection {
        if(this.price == paid) {
            System.out.println("Payment complated.");
        } else {
            throw new PaymentInsufficientExpection("Payment failed.");
        }
    }

    public int getPrice() {
        return this.price;
    }
}
