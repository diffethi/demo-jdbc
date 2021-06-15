package fr.diginamic.jdbc.dao;

import fr.diginamic.jdbc.entities.Fournisseur;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FournisseurDaoJdbc implements FournisseurDao {
    public FournisseurDaoJdbc() {
    }

    public FournisseurDaoJdbc(Fournisseur fournisseur) {

    }


    public static void main(String[] args) {


    }

    @Override
    public List<Fournisseur> extraire() {
        Fournisseur fournisseur=null;
        try {
            DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta2", "root", "");
            Statement statement = connection.createStatement();
            ResultSet curseur = statement.executeQuery("SELECT * FROM fournisseur");
            ArrayList<fr.diginamic.jdbc.Fournisseur> fournisseurs = new ArrayList<>();
            while (curseur.next()) {
                Integer id = curseur.getInt("id");
                String nom = curseur.getString("nom");
                fr.diginamic.jdbc.Fournisseur clientCourant = new fr.diginamic.jdbc.Fournisseur(id,nom);
                fournisseurs.add(clientCourant);

            }
            System.out.println(fournisseurs+"/n");
            curseur.close();
            statement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Fournisseur> extraire(Fournisseur fournisseur) {
        return null;
    }

    @Override
    public boolean insert(String fournisseur) {
       // Fournisseur fournisseur=new Fournisseur(5,"tresor publique");
        try {
            DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta2", "root", "");
            Statement statement = connection.createStatement();
            int nb= statement.executeUpdate("INSERT INTO fournisseur (ID,NOM) VALUES(5,'tresor publique')");
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
    }

    @Override
    public int update(String ancienNom, String nouveauNom) {
        try {
            DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta2", "root", "");
            Statement statement = connection.createStatement();
            int nb=statement.executeUpdate("UPDATE fournisseur SET nom='tresor prive' WHERE  nom='tresor publique'");
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    @Override
    public boolean delete(Fournisseur fournisseur) {
        try {
            DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta2", "root", "");
            Statement statement = connection.createStatement();
            int nb= statement.executeUpdate("DELETE FROM fournisseur WHERE nom='La Mainson de la Peinture'");
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
}
