package fr.diginamic.jdbc.dao;

import fr.diginamic.jdbc.entities.Fournisseur;

import java.util.List;

public interface FournisseurDao {
    List<Fournisseur> extraire();
    void insert(String fournisseur);
    int update(String ancienNom, String nouveauNom);
    boolean delete(Fournisseur fournisseur);
}
