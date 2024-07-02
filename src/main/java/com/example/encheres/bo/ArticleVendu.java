package eni.projet.enchere.bo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ArticleVendu {
	
	private int noArticle;
	private String nomArticle;
	private String description;
	private LocalDate dateDebutEnchere;
	private LocalDate dateFinEnchere;
	private float prixInitial;
	private float prixVente;
	
	private Categorie categorie;
	
	private Utilisateur vendeur;
	private Utilisateur acheteur;
	private List<Enchere> encheres;
	


public ArticleVendu(int noArticle, String nomArticle, String description, LocalDate dateDebutEnchere,
			LocalDate dateFinEnchere, float prixInitial, float prixVente, Categorie categorie, Utilisateur vendeur, Utilisateur acheteur,
			List<Enchere> encheres) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEnchere = dateDebutEnchere;
		this.dateFinEnchere = dateFinEnchere;
		this.prixInitial = prixInitial;
		this.prixVente = prixVente;
		this.categorie = categorie;
		this.vendeur =  new Utilisateur();
		this.acheteur =  new Utilisateur();
		this.encheres = new ArrayList<Enchere>();
	}

public int getNoArticle() {
	return noArticle;
}

public void setNoArticle(int noArticle) {
	this.noArticle = noArticle;
}

public String getNomArticle() {
	return nomArticle;
}

public void setNomArticle(String nomArticle) {
	this.nomArticle = nomArticle;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public LocalDate getDateDebutEnchere() {
	return dateDebutEnchere;
}

public void setDateDebutEnchere(LocalDate dateDebutEnchere) {
	this.dateDebutEnchere = dateDebutEnchere;
}

public LocalDate getDateFinEnchere() {
	return dateFinEnchere;
}

public void setDateFinEnchere(LocalDate dateFinEnchere) {
	this.dateFinEnchere = dateFinEnchere;
}

public float getPrixInitial() {
	return prixInitial;
}

public void setPrixInitial(float prixInitial) {
	this.prixInitial = prixInitial;
}

public float getPrixVente() {
	return prixVente;
}

public void setPrixVente(float prixVente) {
	this.prixVente = prixVente;
}

public Utilisateur getVendeur() {
	return vendeur;
}

public void setVendeur(Utilisateur vendeur) {
	this.vendeur = vendeur;
}

public Utilisateur getAcheteur() {
	return acheteur;
}

public void setAcheteur(Utilisateur acheteur) {
	this.acheteur = acheteur;
}

public List<Enchere> getEncheres() {
	return encheres;
}

public void setEncheres(List<Enchere> encheres) {
	this.encheres = encheres;
}

public Categorie getCategorie() {
	return categorie;
}

public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}

@Override
public String toString() {
	return "ArticleVendu [noArticle=" + noArticle + ", nomArticle=" + nomArticle + ", description=" + description
			+ ", dateDebutEnchere=" + dateDebutEnchere + ", dateFinEnchere=" + dateFinEnchere + ", prixInitial="
			+ prixInitial + ", prixVente=" + prixVente + ", categorie=" + categorie + ", vendeur=" + vendeur
			+ ", encheres=" + encheres + "]";
}


	
	
}