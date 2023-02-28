package EXERCICE1;

import java.util.ArrayList;

import EXERCICE1.Methodes.Noeud;

public class EtudiantTest {
	public static void main(String[] args) {
		Etudiant e1=new Etudiant("FAYA","Lidao",18);
		Etudiant e2=new Etudiant("FAYA","Lidao",14);
		Etudiant e3=new Etudiant("FAYA","Lidao",10);
		ArrayList<Etudiant> tab_Etudiant=new ArrayList<Etudiant>();
		tab_Etudiant.add(e1);
		tab_Etudiant.add(e2);
		tab_Etudiant.add(e3);
	    int TableauEtudiant[] = {e1.getAge(),e2.getAge(),e3.getAge()};
	    int longueur= TableauEtudiant.length;
	     
	    //1 
	    Methodes abt=new Methodes();
	    Noeud racine = Methodes.ConstructionDuBST(TableauEtudiant, longueur);
	    //2clasement.
	    System.out.println("L age le Plus Grand Parmies les eleve est:"+racine.data);
	    
	    //3Complexite
	    //O(n^n)
	    
	    for (int i = 0; i<tab_Etudiant.size(); i++) {
			 
			   if(racine.data==tab_Etudiant.get(i).getAge()) {
				  System.out.println(tab_Etudiant.get(i).InfosEtudiant());
			   }
	    }
	}
}

