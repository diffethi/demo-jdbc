package fr.diginamic.jdbc;

public class Fournisseur {
    int id;
    String nom;

    public Fournisseur(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Fournisseur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
