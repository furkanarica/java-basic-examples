public class Main {
    public static void main(String[] args) {
        User user = new User();

        user.id = 1;
        user.name = "Furkan";
        user.surname = "Arıca";
        user.age = 23;
        user.height = 1.83;
        user.weight = 68;

        UserManager userManager = new UserManager();
        userManager.Create(user);
        userManager.Delete(user);
        userManager.Update(user);
    }
}