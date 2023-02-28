package dms42;

public abstract class ArticleScolaire extends ProduitAvecTva{
	
	public static final double tauxTva=18/100;
	
	private double prixUnitaire;
	private int quantite;
	/*
	 * Les attributs prixUniatire et quantite  n ont pas d accesseurs et de Mutateurs
	 */
	public double getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
	/*
	 * Il faut soit que la class ArticleScolaire soit abstraite elle peut bien aussi ne pas l etre sans donner d erreurs 
	 * Et il faut Creer des Guetters et des Setters pour les attributs PrixUnitaire et Qunatité
	 */
}
