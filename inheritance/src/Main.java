public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        User user = new User();
        admin.userName= "admin";
        user.userName = "user123";

        System.out.println(admin.userName);
        System.out.println(user.userName);

        UserManager userManager = new UserManager();
        AdminManager adminManager = new AdminManager();
        userManager.Create();
        userManager.List();
        userManager.AddCreditCard();

        adminManager.Create();
        adminManager.List();
    }
}