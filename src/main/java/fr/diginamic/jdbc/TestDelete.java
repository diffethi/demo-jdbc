package fr.diginamic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta2", "root", "");
            Statement statement = connection.createStatement();
            int nb= statement.executeUpdate("DELETE FROM fournisseur WHERE nom='La Maison des Peintures'");
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
