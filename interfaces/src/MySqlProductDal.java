public class MySqlProductDal implements IBaseProductDal {
    @Override
    public void create() {
        System.out.println("Product added to mysql database.");
    }
}
