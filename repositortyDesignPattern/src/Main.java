public class Main {
    public static void main(String[] args) {
        ProductDal productDal = new ProductDal();
        Product product = new Product();
        productDal.create(product);

        Validator validator = new Validator();
        validator.isValid(new Product());
        validator.isValid(new User());
    }

}