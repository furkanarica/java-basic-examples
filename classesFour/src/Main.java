public class Main {
    public static void main(String[] args) {
        Product objOne = new Product();
        Product objTwo = new Product();

        objTwo = objOne;

        objOne.name = "Water";
        System.out.println(objTwo.name);

    }
}