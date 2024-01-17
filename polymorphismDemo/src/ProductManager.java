public class ProductManager {
    private BaseLogger logger;

    public ProductManager(BaseLogger baseLogger) {
        this.logger = baseLogger;
    }

    public void create() {
        System.out.println("Product created.");
        this.logger.log();
    }
}
