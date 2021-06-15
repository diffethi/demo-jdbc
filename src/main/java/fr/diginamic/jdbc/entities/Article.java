package fr.diginamic.jdbc.entities;

public class Article<fournisseur> {
    public static String getnom;
    public static int getid;
    int id;
    String nom;
    String designation;

    public Article() {

    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", designation='" + designation + '\'' +
                ", fournisseur='" + fournisseur + '\'' +
                ", prix=" + prix +
                '}';
    }

    String fournisseur;

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Article(double prix) {
        this.prix = prix;
    }

    double prix;

    public Article(int id, String nom, String designation, String fournisseur) {
        this.id = id;
        this.nom = nom;
        this.designation = designation;
        this.fournisseur = fournisseur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(String fournisseur) {
        this.fournisseur = fournisseur;
    }

}
