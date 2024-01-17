public abstract class BaseAuthorize {
    public abstract void login();

    public final void logout() {
        System.out.println("Logged out from system.");
    }
}
