import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        DbHelper helper = new DbHelper();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from staff");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("first_name"));
            }

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        }
        finally {
            connection.close();
            statement.close();
            resultSet.close();
        }
    }
}