public class ProductManager {
    IBaseProductDal baseProductDal;

    public void create() {
        baseProductDal.create();
    }
}
