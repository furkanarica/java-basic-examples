import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {
        ProductManager product = new ProductManager();

        System.out.println(product.getNumberOfStock());
        try {
            product.buy(2);
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(product.getNumberOfStock());


    }
}