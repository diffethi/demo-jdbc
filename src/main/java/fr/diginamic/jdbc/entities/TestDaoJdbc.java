package fr.diginamic.jdbc.entities;


import fr.diginamic.jdbc.dao.FournisseurDaoJdbc;

public class TestDaoJdbc extends FournisseurDaoJdbc {
    public static void main(String[] args) {
        FournisseurDaoJdbc fournisseurDaoJdbc=new FournisseurDaoJdbc();
        fournisseurDaoJdbc.insert("France de Materiaux");

        fournisseurDaoJdbc.extraire();

        fournisseurDaoJdbc.update("France de Materiaux","France Materiaux");






    }


    public FournisseurDaoJdbc getFournisseurDaoJdbc() {
        return getFournisseurDaoJdbc();

    }
};














