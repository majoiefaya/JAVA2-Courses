package JAVAHEAP;

public class UnionFindSend {
    public static int[] Tableau;
    

    public static boolean RetrouverElements(int PremierElement,int DeuxiemeElement) {
        if (Tableau[PremierElement]==-Tableau[DeuxiemeElement]) {
            System.out.println("Les deux �l�ments sont Connect�s ");
            return true;
        }else{
            System.out.println("Les �l�m�nts sont Deconnect�s");
            return false;
        }
    }

    public static void Union(int PremierElement,int DeuxiemeElement) {
        if (RetrouverElements(PremierElement,DeuxiemeElement)) {
            System.out.println("El�ments d�j� connect�s.");
        }else{
            int t=Tableau[PremierElement];
        for (int i = 0; i < Tableau.length; i++) {
            if(Tableau[i]==t){
                Tableau[i]=-Tableau[DeuxiemeElement];
            }
        }
        System.out.println("Les deux �l�ments sont connect�s");
        }
        
    }

    public static void Afficher(int[]Tableau) {
        for (int i = 0; i < Tableau.length; i++) {
            System.out.print("  "+Tableau[i]+"  ");
        }

        System.out.println("\n");
    }
    
    public static void main(String[] args){
        Tableau= new int [6];
        for (int i = 0; i < Tableau.length; i++) {
            Tableau[i]=i;
        }

        Afficher(Tableau);
        RetrouverElements(1, 2);
        Union(1, 5);
        Afficher(Tableau);
       
        
    }

}
