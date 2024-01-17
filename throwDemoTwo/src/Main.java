public class Main {
    public static void main(String[] args) {
        ProductManager product = new ProductManager(1000);

        System.out.println("Price of product : " + product.getPrice() + " TL");

        try {
            product.sell(800);
        } catch (PaymentInsufficientExpection expection) {
            System.out.println(expection.getMessage());
        }
    }
}