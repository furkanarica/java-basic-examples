public class Main {
    public static void main(String[] args) {
        int [] arrayOne = new int[] {1,2};
        int [] arrayTwo = new int[] {3,4};

        arrayTwo = arrayOne;

        arrayOne[0] = 5;
        System.out.println(arrayTwo[0]);

    }
}