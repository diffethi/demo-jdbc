import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnexionJdbc {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta2", "root", "");
            System.out.println(connection);
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(connection);
        }

    }

