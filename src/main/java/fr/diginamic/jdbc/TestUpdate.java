package fr.diginamic.jdbc;

import java.sql.*;


public class TestUpdate {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta2", "root", "");
            Statement statement = connection.createStatement();
            int nb=statement.executeUpdate("UPDATE fournisseur SET nom='La Maison des Peintures' WHERE  ID=4");
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        }
    }

