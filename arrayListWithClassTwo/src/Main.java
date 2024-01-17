import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();

        User user = new User(1,"Furkan","Arıca");

        users.add(user);
        users.add(new User(2,"Mehmet","Işık"));

        users.remove(user);
        users.remove(new User(2,"Mehmet","Işık"));

        for (User u:users) {
            System.out.println(u.firstName + " " + u.lastName);
        }
    }
}