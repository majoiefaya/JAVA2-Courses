package dms42;

public abstract class ProduitAvecTva {

	public double calculTva(int Prixunitaire,int quantit�,int tauxTVA) {
		double TVA=Prixunitaire*quantit�*tauxTVA;
		return TVA;
	}
	/*
	 * La Methode calculTva ne peut etre abastraite si elle doit contenir Un corps de Methode
	 */
}
