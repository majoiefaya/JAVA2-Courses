package EXERCICE4;

public class Exo4 {
	public int puissance(int base,int exposant) {
		while(exposant>1) {
			base=base*base;
			exposant-=1;
		}
		return base;
	}
}
