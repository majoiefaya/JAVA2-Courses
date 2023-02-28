package EXERCICE4;

import java.util.Scanner;

public class TestExo4 {
	public static void main(String[] args) {
		Scanner entry=new Scanner(System.in);
		System.out.println("Entrez la base");
		int base=entry.nextInt();
		System.out.println("Entrez l'Exposant");
		int exposant=entry.nextInt();
		Exo4 Exo=new Exo4();
		System.out.println(Exo.puissance(base, exposant));

	}
}
