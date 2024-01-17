import java.sql.*;
import java.util.ArrayList;

public class Main {
    static DbHelper helper = new DbHelper();
    static Connection connection = null;
    static ResultSet resultSet= null;
    static PreparedStatement preparedStatement = null;


    public static void main(String[] args) {
        connectToDatabase();
        select();
        //insert();
        //update();
        delete();
    }

    public static void connectToDatabase() {
        try {
            connection = helper.getConnection();
            System.out.println("Connection is success.");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        }
    }

    public static void select() {
        Statement statement = null;
        ArrayList<Language> languages = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select language_id,name from language");
            languages = new ArrayList<Language>();
            while (resultSet.next()) {
                languages.add(new Language(
                        resultSet.getInt("language_id"),
                        resultSet.getString("name")
                        ));
            }
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        }
    }

    public static void insert() {
        try {
            String sql = "insert into language (language_id, name) values(?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,8);
            preparedStatement.setString(2,"Turkey");
            preparedStatement.executeUpdate();
            System.out.println("Data added to database.");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        }
    }

    public static void update() {
        try {
            String sql = "update language set name = ? where language_id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"Bangladesh");
            preparedStatement.setInt(2,7);
            preparedStatement.executeUpdate();
            System.out.println("Data updated.");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        }
    }

    public static void delete() {
        String sql = "delete from language where language_id = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,7);
            preparedStatement.executeUpdate();
            System.out.println("Data successfully deleted from database.");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        }
    }
}