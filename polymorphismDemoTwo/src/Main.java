public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI(new PersonalCreditManager());
        double result = creditUI.baseCreditManager.calculate(2000);

        System.out.println(result);
    }
}