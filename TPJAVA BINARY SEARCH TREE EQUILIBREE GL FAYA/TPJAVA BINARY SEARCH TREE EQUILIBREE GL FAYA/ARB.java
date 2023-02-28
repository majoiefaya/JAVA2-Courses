package dms42;


class ARB {
 

    class Noeud {
        int cle;
        Noeud gauche, droit;
 
        public Noeud(int item)
        {
            cle = item;
            gauche = droit = null;
        }
    }
 
    ///on cr�er la racine;
    Noeud racine;
 
    ///On verfie si la  racine es nulle ou n es pas definie
    ARB() { racine = null; }
 
    ///Et si la condition s avere vrai on cr�er une nouvelle racine
    ARB(int value) { racine = new Noeud(value); }
 
    // On cr�er Une fonction charg�e d appeller La fonction qui permer  de cr�er Un  nouveau noeud(InsererElement)
    void insert(int cle) { racine = InsererElement(racine, cle); }
 
    ///On definit la fonction InsererElement
    Noeud InsererElement(Noeud racine, int cle)
    {
 
        ///Une fois encore on essaye de voir si la racine es indefinie si oui on cr�er Une Nouvelle grace a la Classe Noeud
        //et Apres nous retournous une racine comme resultat
        if (racine == null) {
            racine = new Noeud(cle);
            return racine;
        }
 
        ///Si la racine est definie on verifie d abord si la cl� est recue dans le parametre de la fonction InsererElement 
        ///est inferieur a la cle de la racine passer en parametre dans la meme onction
        if (cle < racine.cle)
            racine.gauche = InsererElement(racine.gauche, cle);
        ///Sinon on verifie si la cle pass�e en paramatre est superieur a celle de la racine
        else if (cle > racine.cle)
            racine.droit = InsererElement(racine.droit, cle);
        ///Si les 2 conditions ne sont pas v�rifi�es On retourne  la racine comme resultat de l appel de la fonction
        return racine;
    }
 
    // On cr�er Une Methode qui appelle La Methode Inserer Element
    void classement() { InsererElement(racine); }
 
    // Cette fonction fait appel a la fonction precedente et utilise son script pour ordonner les elements ajout�s
    void InsererElement(Noeud racine)
    {
        if (racine != null) {
            InsererElement(racine.gauche);
            System.out.println(racine.cle);
            InsererElement(racine.droit);
        }
    }
 
    public static void main(String[] args)
    {
        ARB ABE = new ARB();
 
        ABE.insert(9);
        ABE.insert(1);
    
        ABE.classement();
    }
}


