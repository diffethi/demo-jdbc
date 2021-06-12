package fr.diginamic.jdbc.dao;

import fr.diginamic.jdbc.entities.Fournisseur;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FournisseurDaoJdbc2 implements FournisseurDao {
    public FournisseurDaoJdbc2() {
    }

    public FournisseurDaoJdbc2(Fournisseur fournisseur) {

    }


    public static void main(String[] args) {


    }

    @Override
    public List<Fournisseur> extraire() {
        Fournisseur fournisseur=null;
        try {
            DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta2", "root", "");
            PreparedStatement extract=connection.prepareStatement("SELECT * FROM fournisseur WHERE ID=? AND nom=?");
            extract.setInt(1,7);
            extract.setString(2,"materiaux du monde");
            ResultSet result = extract.executeQuery();
            ArrayList<Fournisseur> fournisseurs = new ArrayList<>();
            while (result.next()) {
                Integer id = result.getInt("id");
                String nom = result.getString("nom");
                Fournisseur clientCourant = new Fournisseur(id,nom);
                fournisseurs.add(clientCourant);

            }
            System.out.println(fournisseurs+"/n");
            result.close();

            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public void insert(String fournisseur) {
        // Fournisseur fournisseur=new Fournisseur(5,"tresor publique");
        try {
            DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta2", "root", "");
            PreparedStatement insert=connection.prepareStatement("INSERT INTO fournisseur (ID,NOM) VALUES(5,'tresor publique')");
            insert.setInt(1,9);
            insert.setString(2,"materiaux du monde");
            ResultSet result = insert.executeQuery();
            ArrayList<Fournisseur> fournisseurs = new ArrayList<>();
            while (result.next()) {
                Integer id = result.getInt("id");
                String nom = result.getString("nom");
                Fournisseur clientCourant = new Fournisseur(id,nom);
                fournisseurs.add(clientCourant);

            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public int update(String ancienNom, String nouveauNom) {
        try {
            DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta2", "root", "");
            PreparedStatement insert =connection.prepareStatement("INSERT INTO fournisseur (ID,NOM) VALUES(4,'LE BARON')");
            insert.setInt(1,4);
            insert.setString(2,"le baron");
            ResultSet result = insert.executeQuery();
            ArrayList<Fournisseur> fournisseurs = new ArrayList<>();

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
            PreparedStatement delete = connection.prepareStatement("delete  fournisseur set ID");

            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
}
