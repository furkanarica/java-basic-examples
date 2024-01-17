public class Main {
    public static void main(String[] args) {
        Product objOne = new Product();
        Product objTwo = objOne;

        objOne.name = "T-shirt";
        objOne.color = "Red";

        System.out.println(objOne.name);
        System.out.println(objOne.color);

        System.out.println("--------------");

        System.out.println(objTwo.name);
        System.out.println(objTwo.color);
    }
}