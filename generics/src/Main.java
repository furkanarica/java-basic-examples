public class Main {
    public static void main(String[] args) {
        DbOperations<Prodcut> dbOperations = new DbOperations<Prodcut>();
        dbOperations.create(new Prodcut());
        dbOperations.delete(new Prodcut());
    }
}