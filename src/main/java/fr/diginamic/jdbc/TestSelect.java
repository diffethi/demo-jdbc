package fr.diginamic.jdbc;

import java.sql.*;
import java.util.ArrayList;

public class TestSelect {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta2", "root", "");
            Statement statement = connection.createStatement();
            ResultSet curseur = statement.executeQuery("SELECT ID, NOM FROM fournisseur");
            ArrayList<Fournisseur> fournisseurs = new ArrayList<>();
            while (curseur.next()) {
                Integer id = curseur.getInt("id");
                String nom = curseur.getString("nom");
                Fournisseur clientCourant = new Fournisseur(id,nom);
                fournisseurs.add(clientCourant);

            }
            System.out.println(fournisseurs+"/n");
            curseur.close();
            statement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
