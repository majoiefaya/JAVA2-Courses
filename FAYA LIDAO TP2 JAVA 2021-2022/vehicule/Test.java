package vehicule;

import java.util.ArrayList;

import chap5.Employe;

import java.util.*;

public class Test {

	public static void main(String[]args) {
		ArrayList<Vehicule> tabVehicule=new ArrayList<>();
		Scanner entre=new Scanner(System.in);
		
		
		while(true) {
			System.out.print("1-Ajout d'une Entite\n2-Affichage Complet des Vehicules");
			System.out.print("\nQue voulez vous faire?");
			int choix=entre.nextInt();
			switch (choix){
			case 1:
				System.out.print("1-Ajouter Voiture\n2-Ajouter Avion\n");
				System.out.println("Que voulez vous Ajouter?");
				int choix2=entre.nextInt();
				switch (choix2) {
				case 1:
					System.out.println("Entrez le Matricule ");
					String matriV=entre.next();
					System.out.println("Entrez le Prix ");
					double prixV=entre.nextDouble();
					System.out.println("Entrez l Anne du Model ");
					String  AnneModelV=entre.next();
					Voiture voiture=new Voiture(matriV,prixV,AnneModelV);
					tabVehicule.add(voiture);
				break;
				
				case 2:
					System.out.println("Entrez le Matricule ");
					String matriA=entre.next();
					System.out.println("Entrez le Prix ");
					double prixA=entre.nextDouble();
					System.out.println("Entrez le Model de l'Avion ");
					String  ModelA=entre.next();
					System.out.println("Entrez l Anne du Model ");
					String  AnneModelA=entre.next();
					Avion avion=new Avion(matriA,prixA,AnneModelA,ModelA);
					tabVehicule.add(avion);
					
					break;
				}
			break;
			case 2:
				System.out.print("\n1-Liste des Avions\n2-Liste des Voitures\n");
				
				int choix3=entre.nextInt();
				switch (choix3){
				case 1:
					System.out.print("\nListe Avion\n");
					for (int i = 0; i<tabVehicule.size(); i++) {
						if(tabVehicule.get(i) instanceof Avion) {
							System.out.println(tabVehicule.get(i).AfficherInfosVehicule());
						}
							
					}
					break;
				case 2:
					System.out.print("\nListe Voiture\n");
					for (int i = 0; i<tabVehicule.size(); i++) {
						if(tabVehicule.get(i) instanceof Voiture) {
							System.out.println(tabVehicule.get(i).AfficherInfosVehicule());
						}
						
					}
					break;
				}
				
				
			break;
			
		}
		
	}
		
							
				
		
	}
}
