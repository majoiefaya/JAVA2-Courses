package vehicule;


public abstract class Vehicule {
	
	private String matricule;
	private int vitesse;
	private double prix;
	private String AnnneModele;
	
	public Vehicule(String matri,double p,String anne) {
		this.matricule = matri;
		this.setVitesse(0);
		this.prix = p;
		this.AnnneModele = anne;
	}



	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public int getVitesse() {
		return vitesse;
	}
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getAnnneModele() {
		return AnnneModele;
	}
	public void setAnnneModele(String annneModele) {
		AnnneModele = annneModele;
	}
	
	public void Demarrer() {
		
	}
	
	public void Accelerer(double vitesse) {
		
	}
	
	public String AfficherInfosVehicule() {
		return "Le Matricule de la Voitue est:"+this.getMatricule()+"\nSa Vitesse est:"+this.getVitesse()+"\nLe Prix est:"+this.getPrix()+"\nL Anne du Model est:"+this.getAnnneModele();
		
	}
	
	
}

