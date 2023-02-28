package dms42;

public class Humain {

	/*
	 * 1. 3 versions surchagées de La Methode Manger 
	 */
	public void manger() {
		System.out.println("Je mange comme un Homme");
	}
	
	public int manger(int nombre) {
		return nombre;
	}
	
	public boolean manger(boolean nbre) {
		return nbre ==false? false:true;
	}
}
