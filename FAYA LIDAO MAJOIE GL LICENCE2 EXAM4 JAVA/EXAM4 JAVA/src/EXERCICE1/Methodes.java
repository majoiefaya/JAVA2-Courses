package EXERCICE1;

class Methodes
{
	
	static class Noeud
	{
	    int data;
	    Noeud gauche, droit;
		public Noeud ConstructionDuBST(int[] tableauEtudiant, int longueur) {
			// TODO Auto-generated method stub
			return null;
		}
	};
	 
	 
	///Recuper Un Nouveau Noeud
	static Noeud getNoeud(int data)
	{
	
	    Noeud newNoeud = new Noeud();
	
	    newNoeud.data = data;
	    newNoeud.gauche = newNoeud.droit = null;
	    return newNoeud;
	}
	//2Methode qui retourne l etudiant le plus agé
	static Noeud classement(Noeud racine , int data)
	{
	    if(racine == null)
	    {
	        racine = getNoeud(data);
	        return racine;
	    }
	    if(data <= racine.data)
	    racine.gauche = classement(racine.gauche, data);
	    else
	    racine.droit = classement(racine.droit, data);
	    return racine;    
	}
	 //1Methode pour transformer l etudian en arbre equilibré
	static Noeud ConstructionDuBST(int arr[], int n)
	{
	    if(n == 0)return null;
	    Noeud racine = null;
	 
	    for(int i = 0; i < n; i++)
	    racine = classement(racine , arr[i]);
	     
	    return racine;
	}
	
	 
	// 
		public static void main(String []args)
		{
			Etudiant e1=new Etudiant("FAYA","Lidao",18);
			Etudiant e2=new Etudiant("FAYA","Lidao",14);
			Etudiant e3=new Etudiant("FAYA","Lidao",10);
			
		    int TableauEtudiant[] = {e1.getAge(),e2.getAge(),e3.getAge()};
		    int longueur= TableauEtudiant.length;
		     
		    
		    Noeud racine = ConstructionDuBST(TableauEtudiant, longueur);
		    System.out.println(racine);
		    //3Complexite
		    //O(n^n)
		   
		    
	}
}