import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();

        products.add(new Product(1,"Macbook Pro M1","Apple"));
        products.add(new Product(2,"Macbook Air M1","Apple"));
        products.add(new Product(3,"Macbook Pro M2","Apple"));
        products.add(new Product(4,"Aspire V Nitro","Acer"));

        for (Product product:products) {
            System.out.println(product.brand + " " + product.name);
        }
    }
}