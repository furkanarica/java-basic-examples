public class Samsung implements ISalable, IRechargeableWithTypeC {
    @Override
    public void sell () {
        System.out.println("Phone that samsung model is salable.");
    };

    @Override
    public void rechargeableWithTypeC() {
        System.out.println("This phone is rechargeable with type-c.");
    }
}
