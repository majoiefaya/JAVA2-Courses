package vehicule;


public class Voiture extends Vehicule {

	public Voiture(String matri, double p, String anne) {
		super(matri, p, anne);
	}
	

	public void Demarrer() {
		System.out.println("La Voiture"+this.getMatricule()+" s'apprete a d�marrer  a une Vitesse de "+this.getVitesse());
	}
	
	public void Accelerer(double newvitesse) {
		double vitesseCourante=this.getVitesse();
		vitesseCourante+=newvitesse;
		System.out.print("La nouvelle Vitesse de la Voiture est de "+vitesseCourante);
		
	}
	
	

}
