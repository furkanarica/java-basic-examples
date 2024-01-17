public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setName("Playstation");
        product.setBrand("Sony");
        product.setType("Electronics");
        product.setPrice(5000);

        System.out.println(product.getBrand() + " " + product.getName() + " ---> " + product.getPrice());

        ProductManager productManager = new ProductManager();
        productManager.Create(product);
        int id = product.getId();
        productManager.Delete(id);
    }
}