package fr.diginamic.jdbc.entities;

public class Fournisseur {
    int id;
    String nom;

    public Fournisseur(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Fournisseur() {

    }

    @Override
    public String toString() {
        return "Fournisseur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }

}
