public class FindNumber {
    static int number = 7;

    public FindNumber() {

    }
    public static String isThere(int value, int [] array) {
        for (int element:array) {
            if (element == value)
                return "There is";
        }
        return "There is not";
    }

    public static void main (String [] args) {
        int [] array = new int[] {1,3,5,7,7,11};
        String state = isThere(number,array);
        System.out.println(state);
    }
}
