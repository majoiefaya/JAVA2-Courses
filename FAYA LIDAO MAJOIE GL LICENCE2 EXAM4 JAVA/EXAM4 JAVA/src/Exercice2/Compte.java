package Exercice2;

public class Compte {

	private String NomProp;
	private int Solde ;
	
	public String getNomProp() {
		return NomProp;
	}
	public void setNomProp(String nomProp) {
		NomProp = nomProp;
	}
	public int getSolde() {
		return Solde;
	}
	public void setSolde(int solde) {
		Solde = solde;
	}
	
	public void RetirerSolde(int Montant) {
		if(Montant>this.getSolde()) {
			System.out.println("Le Montant du retrait a dépassé le solde du compte");
		}else {
			this.setSolde(this.getSolde()-Montant);
			System.out.println("Solde Bien Retiré ,Votre Montant Actuelle est de :"+this.getSolde());
		}
	}
}
