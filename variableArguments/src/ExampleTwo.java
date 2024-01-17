public class ExampleTwo {
    public static String combineToString(String... statements) {
        String expression = "";
        for (String element:statements) {
            expression+=element;
        }
        return expression;
    }

    public static void main (String [] args) {
        String result = combineToString("Furkan ","Arıca ","23 ");
        System.out.println(result);
    }
}
