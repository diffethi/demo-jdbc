package fr.diginamic.jdbc.dao;

import java.lang.ref.PhantomReference;
import java.sql.*;

import fr.diginamic.jdbc.entities.Article;

public class ArticleDaoJdbc {
    public ArticleDaoJdbc(String url, String user, String password) {
    }

    public void insert(Article article) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/compta");
            PreparedStatement statement = connection.prepareStatement("INSERT INTO Article prix =? designation= ? where fournisseur= La Maison de la Peinture");
            statement.setDouble(1, 12.5);
            statement.setString(2, "Peinture blanche 1L");

            statement.setDouble(1, 15.5);
            statement.setString(2, " Peinture rouge mate 1L ");

            statement.setDouble(1, 17.8);
            statement.setString(2, "Peinture noire laquée 1L");

            statement.setDouble(1, 15.5);
            statement.setString(2, "Peinture bleue mate 1L");
            statement.executeUpdate();

            statement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void update () {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/compta");
            PreparedStatement statement = connection.prepareStatement("update Article set prix =prix -prix*25/100 where designation like = '%Peinture % mate' ");

            statement.executeUpdate();

            statement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public void delete1 (Article article) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/compta");
            PreparedStatement statement = connection.prepareStatement("delete nom from Article where id=?");
            statement.setString(1, article.getDesignation());
            statement.setInt(2, article.getId());
            statement.executeUpdate();

            statement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void select1 () {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/compta");
            PreparedStatement statement = connection.prepareStatement("select * from Article");
            ResultSet result = statement.executeQuery();
            System.out.println(result);

            statement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void select () {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/compta");
            PreparedStatement statement = connection.prepareStatement("select avg (prix) from Article");
            ResultSet resultavg = statement.executeQuery();
            System.out.println(resultavg);

            statement.close();

            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void delete (Article article){

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/compta");
            PreparedStatement statement2 = connection.prepareStatement("delete *  from Article where designation like='%Peinture%'");
            statement2.executeUpdate();
            statement2.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}