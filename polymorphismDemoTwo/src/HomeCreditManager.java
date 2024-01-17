public class HomeCreditManager extends BaseCreditManager {
    @Override
    public double calculate(double money) {
        return money * 1.43;
    }
}
