package fr.diginamic.jdbc.dao;

import fr.diginamic.jdbc.entities.Article;
import fr.diginamic.jdbc.entities.Fournisseur;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FournisseurDaoJdbc2 implements FournisseurDao {
    Article article=new Article();
    Fournisseur fournisseur=new Fournisseur();
    public FournisseurDaoJdbc2() {
    }

    public FournisseurDaoJdbc2(Fournisseur fournisseur) {

    }


    public static void main(String[] args) {


    }

    @Override
    public List<Fournisseur> extraire() {
        return null;
    }

    @Override
    public List<Fournisseur> extraire(Fournisseur fournisseur) {
        fournisseur = null;
        try {
            DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta2", "root", "");
            PreparedStatement extract=connection.prepareStatement("SELECT * FROM fournisseur WHERE ID=? AND nom=?");
            extract.setInt(1,article.getId());
            extract.setString(2,article.getNom());
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
    public boolean insert(String fournisseur) throws SQLException {
        //Fournisseur fournisseur=new Fournisseur();


        DriverManager.registerDriver(new org.mariadb.jdbc.Driver());

        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta2", "root", "");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO fournisseur (ID,NOM) VALUES(5,'tresor publique')");
        statement.setInt(1, article.getId());
        statement.setString(2, article.getDesignation());
        ResultSet result = statement.executeQuery();
        ArrayList<Fournisseur> fournisseurs = new ArrayList<>();
        while (result.next()) {
            Integer id = result.getInt(article.getId());
            String nom = result.getString(article.getDesignation());
            Fournisseur four = new Fournisseur();
            fournisseurs.add(four);

            statement.close();
            connection.close();

        }

    public void update (Article article) {
            try {
                DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
                connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta2", "root", "");
                statement = connection.prepareStatement("INSERT INTO fournisseur ID= ?,NOM =?");
                statement.setInt(1, article.getId());
                statement.setString(2, article.getNom());
                result = statement.executeQuery();
                ArrayList<Fournisseur> fournisseurs1 = new ArrayList<>();

                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    public boolean delete (Article article){
            try {
                DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
                Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta2", "root", "");
                PreparedStatement statement1 = connection.prepareStatement("delete  fournisseur set ID");

                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return false;
        }


    @Override
    public int update(String ancienNom, String nouveauNom) {
        return 0;
    }

    @Override
    public boolean delete(Fournisseur fournisseur) {
        return false;
    }
}
