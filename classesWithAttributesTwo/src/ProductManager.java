public class ProductManager {

    public ProductManager() {
        System.out.println("Object created");
    }

    public void Create(Product product) {
        System.out.println("Product created on database.");
    }

    public void Delete(int id) {
        System.out.println("Product deleted from database.");
    }
}
