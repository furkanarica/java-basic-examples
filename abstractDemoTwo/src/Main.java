public class Main {
    public static void main(String[] args) {
        UserManager user = new UserManager();
        user.baseDatabaseManager = new PostgreDatabaseManager();
        user.addUser();
    }
}