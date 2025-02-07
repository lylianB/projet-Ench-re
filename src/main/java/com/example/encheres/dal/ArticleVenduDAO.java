package com.example.encheres.dal;



import java.util.List;

import com.example.encheres.bo.ArticleVendu;

public interface ArticleVenduDAO {
	void create (ArticleVendu articleVendu);
	ArticleVendu read (int noArticle);
	void update (ArticleVendu articleVendu);
	void updatePrixVente (int noArticle, int prixVente);
	void updateAcheteur (int noArticle, int noAcheteur);
	void updateRetrait(int noArticle);
	void delete (int noArticle);
	List<ArticleVendu> findByUtilisateur(int noUtilisateur);
	List<ArticleVendu> findAll();
	List<ArticleVendu> findByCategorie(int noCategorie);
	int countArticle ( int noArticle);
	List<ArticleVendu> findFilter(String nomArticle, int noCategorie );
}
