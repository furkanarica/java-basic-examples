public class ExampleOne {
    public static void main (String [] args) {
        String text = "I would like to go to cinema today.";

        System.out.println("Number of characters that text has : " + text.length());
        System.out.println("Value at index 6 : " + text.charAt(6));

        char [] characters = new char[13];
        text.getChars(2,15,characters,0);
        System.out.println(characters);

        System.out.println(text.concat(" Do you want to come with me?"));

        System.out.println(text.startsWith("I"));
        System.out.println(text.startsWith("I like"));

        System.out.println(text.endsWith("."));
        System.out.println(text.endsWith("y"));

        System.out.println(text.indexOf("o"));
        System.out.println(text.lastIndexOf("o"));
    }
}
