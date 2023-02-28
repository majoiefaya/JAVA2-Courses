package vehicule;


public class Avion extends Vehicule {
	private String modele;
	public Avion(String matri, double p, String anne,String mod) {
		super(matri, p, anne);
		this.modele=mod;
	}
	
	
	public void Demarrer() {
		System.out.println("l Avion"+this.getMatricule()+" s'apprete a d�marrer  a une Vitesse de "+this.getVitesse());
	}
	
	public void Accelerer(double newvitesse) {
		double vitesseCourante=this.getVitesse();
		vitesseCourante+=newvitesse;
		System.out.print("La nouvelle Vitesse de l'Avion est de "+vitesseCourante);
		
	}
	
	
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	
	


}
