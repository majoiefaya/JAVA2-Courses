package Article;

public class ArticleEnSolde extends Article{
	
	private double remise;
	
	public ArticleEnSolde(String n, double p,double r) {
		super(n, p);
		this.remise=r;
	}
	public double GetRemise() {
		return remise;
	}
	public void SetRemise(double remise) {
		this.remise = remise;
	}
	
	
	public double GetPrix() {
		double Prix = this.GetPrix() * (100 - this.GetRemise()) / 100;
		return Prix;
	}
	
	public String Afficher() {
		return "Le prix de L'Article est:"+this.GetPrix()+
				"\nLe Pourcentage de remise sur le Prix d'origine est:"+this.GetRemise();
	}
}
