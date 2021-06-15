package fr.diginamic.jdbc.dao;

import fr.diginamic.jdbc.entities.Article;

public class TestJdbcArticle {
    public TestJdbcArticle() {
    }

    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/compta2";
        String user="blablabla";
        String password="whattheheck";


        Article article=new Article();
        article.setDesignation("Peinture blanche 1L");
        article.setPrix(12.5);

        article.setDesignation("Peinture rouge mate 1L");
        article.setPrix(15.5);

        article.setDesignation("Peinture noire laquée 1L");
        article.setPrix(17.8);

        article.setDesignation("Peinture bleue mate 1L");
        article.setPrix(15.5);

        ArticleDaoJdbc articleDaoJdbc=new ArticleDaoJdbc(url,user,password);
        articleDaoJdbc.insert(article);




    }

}
