public class Example {
    public static void main (String [] args) {
        char symbol = '+';

        switch (symbol) {
            case '+':
            case '-':
            case '/':
            case '*':
                System.out.println("It is a mathematical operation symbol");
                break;
            case '<':
            case '>':
            case '=':
            case '&':
            case '|':
                System.out.println("It is a logical symbol");
                break;
            default:
                System.out.println("It is invalid symbol");
        }
    }
}
