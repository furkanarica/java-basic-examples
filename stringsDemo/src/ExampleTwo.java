public class ExampleTwo {
    public static void main (String [] args) {
        String text = "The weather is so cloudly today.";

        System.out.println(text.toUpperCase());

        System.out.println(text.toLowerCase());

        System.out.println(text.replace('T','t'));

        System.out.println(text.substring(4));
        System.out.println(text.substring(0,11));

        System.out.println("----------");

        for (String word: text.split(" ")) {
            System.out.println(word);
        }

        System.out.println();

        String textForTrim = "       There is a wonderful view here."        ;
        System.out.println(textForTrim.trim());

    }
}
