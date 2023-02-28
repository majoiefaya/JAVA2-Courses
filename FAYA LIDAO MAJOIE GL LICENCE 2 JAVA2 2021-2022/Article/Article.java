package Article;

public class Article {
	private String nom;
	private double Prix;
	
	public Article(String n,double p) {
		this.nom=n;
		this.Prix=p;
	}
	
	
	public String GetNom() {
		return nom;
	}
	public void SetNom(String nom) {
		this.nom = nom;
	}
	public double GetPrix() {
		return Prix;
	}
	public void SetPrix(double prix) {
		Prix = prix;
	}

	public String Afficher() {
		return "Le prix de L'Article est:"+this.GetPrix();
	}
	
}
