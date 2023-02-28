package dms41;

import dms42.Animal;

public class Projet2 {
	public static  void main(String[] args) {
		Animal animal =new Animal();
		animal.deplacer();
		animal.avoirPatte(2);
	}
	/*
	 * La Classe Animal se trouve dans le pakage dms42 or nous trouvon dans le pakage dms41
	 * La classe animal n est donc pas reconnue ici  pour pouvoir l utiliser dans ce Package il faut soit recreer La classa Animal dans ce Package soit l impoter
	 * d un Package ou il est deja definit dans notre Cas dms42
	 * Une fois Le Probleme de la classe Animale resolue il se pose un Probleme de visibilité des Methodes deplacer et avoirPatte qui n arrivent pas a etre defini dans ce pcakge
	 * Malgré le fait qu on aie importé leurs packages d origine 
	 * Elles osnt invisibles dans ce Package car elles ont ete definit comme des Methodes Ne pouvant pas s ouvrir a d autres Packages.Pour Remedier a ce Probleme
	 * Il faut leur donne une visibilité Public
	 */
}
