package dms42;

public abstract class ProduitAvecTva {

	public double calculTva(int Prixunitaire,int quantité,int tauxTVA) {
		double TVA=Prixunitaire*quantité*tauxTVA;
		return TVA;
	}
	/*
	 * La Methode calculTva ne peut etre abastraite si elle doit contenir Un corps de Methode
	 */
}
