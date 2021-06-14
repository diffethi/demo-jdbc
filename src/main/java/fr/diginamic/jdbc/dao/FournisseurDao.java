package fr.diginamic.jdbc.dao;

import fr.diginamic.jdbc.entities.Fournisseur;

import java.sql.SQLException;
import java.util.List;

public interface FournisseurDao {
    List<Fournisseur> extraire();

    List<Fournisseur> extraire(Fournisseur fournisseur);

    boolean insert(String fournisseur) throws SQLException;
    int update(String ancienNom, String nouveauNom);
    boolean delete(Fournisseur fournisseur);
}
