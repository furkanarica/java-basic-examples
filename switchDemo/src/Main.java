import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner note = new Scanner(System.in);

        System.out.println("Please enter your letter grade : ");

        String letterGrade = note.next();

        switch (letterGrade) {
            case "AA" :
                System.out.println("Your letter grade is AA");
                break;
            case "BB" :
                System.out.println("Your letter grade is BB");
                break;
            default:
                System.out.println("Your letter grade is different from AA and BB");
        }
    }
}