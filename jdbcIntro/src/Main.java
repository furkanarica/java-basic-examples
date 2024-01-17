import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    static String userName = "roo";
    static String password = "1234";
    static String dbUrl = "jdbc:mysql://localhost:3306/sakila";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl,userName,password);
            System.out.println("Connection is success.");
        } catch (SQLException exception) {
            exception.getMessage();
        }
        finally {
            connection.close();
        }
    }
}