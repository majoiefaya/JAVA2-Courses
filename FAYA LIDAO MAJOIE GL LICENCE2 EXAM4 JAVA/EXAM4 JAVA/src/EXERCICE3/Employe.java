package EXERCICE3;

public class Employe {

	private String nom;
	private String prenom;
	private double salaire;
	
	public Employe(String n,String p,double sal) throws NegativeSalException{ 
		if(sal<0) {
			throw new NegativeSalException();
		}else {
			this.nom=n;
			this.prenom=p;
			this.salaire=sal;
		}
		
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
}
