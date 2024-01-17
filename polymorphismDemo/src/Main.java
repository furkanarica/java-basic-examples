public class Main {
    public static void main(String[] args) {
        ProductManager product = new ProductManager(new DatabaseLogger());
        product.create();
    }
}