public class Main {
    public static void main(String[] args) {
        ProductManager product = new ProductManager();
        product.baseProductDal = new OracleProductDal();
        product.create();
    }
}