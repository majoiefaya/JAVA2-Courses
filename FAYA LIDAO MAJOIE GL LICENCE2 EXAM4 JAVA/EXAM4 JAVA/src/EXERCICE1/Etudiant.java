package EXERCICE1;

public class Etudiant {

	private String nom;
	private String prenom;
	private int age;
	
	public Etudiant(String nm,String pr,int a) {
		this.nom=nm;
		this.prenom=pr;
		this.age=a;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String InfosEtudiant() {
		return "Le nom de l etudiant le Plus agé est:"+this.getNom()+"Son Prenom est:"+this.getPrenom()+"Et son age est:"+this.getAge();
	}
}
