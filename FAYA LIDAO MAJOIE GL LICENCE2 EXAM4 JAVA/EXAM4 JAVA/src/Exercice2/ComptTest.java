package Exercice2;

import java.util.Scanner;


public class ComptTest {

	public static void main(String [] args) {
		Scanner entry=new Scanner(System.in);
		Compte c=new Compte();
		c.setSolde(2900);
		System.out.println("Entrez La Somme a retirer/NB:Votre Solde Actuelle est de"+c.getSolde());
		int SoldeRetrait=entry.nextInt();
		c.RetirerSolde(SoldeRetrait);
		
	}
}
