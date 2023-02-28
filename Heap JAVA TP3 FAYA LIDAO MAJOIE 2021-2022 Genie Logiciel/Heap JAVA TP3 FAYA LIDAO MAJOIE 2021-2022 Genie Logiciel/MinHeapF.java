package JAVAHEAP;

public class MinHeapF {
	
	//Algo du MinHeap implemente
	static void CréerTasDesMinimums(int Tableau[],int LaTailleDuTableau,int ElementBoucle) {
		int PlusPetitElement=ElementBoucle;
		int Elementgauche=2*ElementBoucle+1;
		int Elementdroit=2*ElementBoucle+2;
		
		if(Elementgauche<LaTailleDuTableau && Tableau[Elementgauche] < Tableau[PlusPetitElement]) {
			PlusPetitElement=Elementgauche;
		}
		if(Elementdroit<LaTailleDuTableau && Tableau[Elementdroit] < Tableau[PlusPetitElement]) {
			PlusPetitElement=Elementdroit;
		}
		if(PlusPetitElement!=ElementBoucle) {
			int VariableSauvegarde=Tableau[ElementBoucle];
			Tableau[ElementBoucle]=Tableau[PlusPetitElement];
			Tableau[PlusPetitElement]=VariableSauvegarde;
			
			CréerTasDesMinimums(Tableau,LaTailleDuTableau,PlusPetitElement);
		}
	}
	
	//Algo du MaxHeap implementé
	static void CréerTasDesMaximums(int Tableau[],int LaTailleDuTableau,int ElementBoucle) {
		int PlusPetitElement=ElementBoucle;
		int Elementgauche=2*ElementBoucle+1;
		int Elementdroit=2*ElementBoucle+2;
		
		if(Elementgauche<LaTailleDuTableau && Tableau[Elementgauche] > Tableau[PlusPetitElement]) {
			PlusPetitElement=Elementgauche;
		}
		if(Elementdroit<LaTailleDuTableau && Tableau[Elementdroit] > Tableau[PlusPetitElement]) {
			PlusPetitElement=Elementdroit;
		}
		if(PlusPetitElement!=ElementBoucle) {
			int VariableSauvegarde=Tableau[ElementBoucle];
			Tableau[ElementBoucle]=Tableau[PlusPetitElement];
			Tableau[PlusPetitElement]=VariableSauvegarde;
			
			CréerTasDesMaximums(Tableau,LaTailleDuTableau,PlusPetitElement);
		}
	}
	
	//Algo Du Heap Sort Implementé en Decroissance
	static void OrdonnancementDuTasDecroissant(int Tableau[]) {
		int LaTailleDuTableau=Tableau.length;
		for (int ElementBoucle=LaTailleDuTableau/2-1;ElementBoucle>=0;ElementBoucle--) {
			CréerTasDesMinimums(Tableau,LaTailleDuTableau,ElementBoucle);
		}
			
		for(int ElementBoucle=LaTailleDuTableau-1;ElementBoucle>=0;ElementBoucle--) {
			int VariableSauvegarde=Tableau[0];
			Tableau[0]=Tableau[ElementBoucle];
			Tableau[ElementBoucle]=VariableSauvegarde;
			
			CréerTasDesMinimums(Tableau,ElementBoucle,0);
		}
			
		
	}
	
	//Algo Du Heap Sort Implementé en Croissance
	static void OrdonnancementDuTasCroissant(int Tableau[]) {
		int LaTailleDuTableau=Tableau.length;
		for (int ElementBoucle=LaTailleDuTableau/2-1;ElementBoucle>=0;ElementBoucle--) {
			CréerTasDesMinimums(Tableau,LaTailleDuTableau,ElementBoucle);
		}
			
		for(int ElementBoucle=LaTailleDuTableau-1;ElementBoucle>=0;ElementBoucle--) {
			int VariableSauvegarde=Tableau[0];
			Tableau[0]=Tableau[ElementBoucle];
			Tableau[ElementBoucle]=VariableSauvegarde;
			
			CréerTasDesMaximums(Tableau,ElementBoucle,0);
		}
			
		
	}
	
	
	//Methode d'Affichage du Tableau et des Elements
	static void AffichageDuTableau(int [] array, int size) {
	     for (Integer i : array) {
	          System.out.print(i + " ");
	       }
	       
	     System.out.println();
	  }

	 public static void main(String[] args) {
	        int [] Tableau= new int[5];
	        Tableau[1] = 40;
	        Tableau[2] = 5;
	        Tableau[3] = 10;
	        Tableau[4] = 9;
	        
	        int LaTailleDuTableau=Tableau.length;
	        
	        OrdonnancementDuTasDecroissant(Tableau);
	        System.out.println("Apres l Ordonancement Decroissant du Tableau le resultat est:");
	        AffichageDuTableau(Tableau,LaTailleDuTableau);
	        
	        
	        OrdonnancementDuTasCroissant(Tableau);
	        System.out.println("Apres l'Ordonancement Croissant du Tableau le resultat est:");
	        AffichageDuTableau(Tableau,LaTailleDuTableau);
	        
	        }
}
