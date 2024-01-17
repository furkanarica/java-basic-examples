import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList informations = new ArrayList();
        informations.add("Furkan");
        informations.add("Arıca");
        informations.add(23);

        System.out.println(informations.get(0) + " " + informations.get(1) + " " + informations.get(2));
        informations.remove(2);
        informations.add(1.83);
        System.out.println(informations.get(2));

        for (Object info: informations) {
            System.out.println(info);
        }
    }
}