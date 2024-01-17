public class UserManager {

    public UserManager() {

    }

    public void Create(User obj) {
        System.out.println(obj.name + " " + obj.surname + " created.");
    }

    public void Update(User obj) {
        System.out.println(obj.id + ". user updated.");
    }

    public void Delete (User obj) {
        System.out.println(obj.id + ". user deleted.");
    }
}
