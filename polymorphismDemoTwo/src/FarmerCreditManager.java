public class FarmerCreditManager extends BaseCreditManager {
    @Override
    public double calculate(double money) {
        return money * 1.30;
    }
}
