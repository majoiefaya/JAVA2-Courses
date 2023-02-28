package dms42;

public class Docteur extends Personne implements PasDeQueue{

	public boolean aUneQueue() {
	
		return false;
	}
	
	public static void main(String[] devoir) {
		Personne p =new Docteur();
		((Docteur) p).aUneQueue();
		
		/*Tout d'abord il faut savoir que le Polymorphisme est un M�canisme qui permet de Modifier Le comportement d'une classe fille par 
		 * rapport a sa classe mere
		 *Utiliser la methode aUneQueue grace a la referende p est possible
		 *Tout d abord nous savons qu Un Docteur est une Personne et que donc on peut acceder a un Docteur en accedant a son etat de Personne ici 
		 *sa eference p
		 *Puisque la Methode aUneQueue est implement�e par la classe Docteur 
		 *pour pouvoir l utilis� avec la reference d une Personne il suffit juste de faire un casting de la classe Docteur a sa reference p
		 */
	}
}
