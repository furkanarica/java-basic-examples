public class ProductManager {
    private int numberOfStock = 1;

    public void buy(int amount) throws Exception {
        if(numberOfStock >= amount) {
            numberOfStock -= amount;
        } else {
            throw new Exception("Not enough products.");
        }
    }
    public int getNumberOfStock() {
        return numberOfStock;
    }
}
