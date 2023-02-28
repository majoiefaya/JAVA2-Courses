package dms42;

import java.util.*;
 
class Delete{
 
static class Noeud
{
    int cle;
    Noeud gauche, droit;
}
 

static Noeud newNoeud(int item)
{
    Noeud temp = new Noeud();
    temp.cle = item;
    temp.gauche = temp.droit = null;
    return temp;
}
 

static void classement(Noeud racine)
{
    if (racine != null)
    {
        classement(racine.gauche);
        System.out.print(racine.cle + " ");
        classement(racine.droit);
    }
}
 

static Noeud Ajouter(Noeud Noeud, int cle)
{
     

    if (Noeud == null)
        return newNoeud(cle);
 

    if (cle < Noeud.cle)
        Noeud.gauche = Ajouter(Noeud.gauche, cle);
    else
        Noeud.droit = Ajouter(Noeud.droit, cle);
 

    return Noeud;
}
 

static Noeud deleteNoeud(Noeud racine, int k)
{
     

    if (racine == null)
        return racine;
 
    if (racine.cle > k)
    {
        racine.gauche = deleteNoeud(racine.gauche, k);
        return racine;
    }
    else if (racine.cle < k)
    {
        racine.droit = deleteNoeud(racine.droit, k);
        return racine;
    }
 
    if (racine.gauche == null)
    {
        Noeud temp = racine.droit;
        return temp;
    }
    else if (racine.droit == null)
    {
        Noeud temp = racine.gauche;
        return temp;
    }
 

    else
    {
        Noeud succParent = racine;
 
        Noeud succ = racine.droit;
         
        while (succ.gauche != null)
        {
            succParent = succ;
            succ = succ.gauche;
        }
 
     
        if (succParent != racine)
            succParent.gauche = succ.droit;
        else
            succParent.droit = succ.droit;

        racine.cle = succ.cle;
 
        return racine;
    }
}
 

public static void main(String args[])
{
     

    Noeud racine = null;
    racine = Ajouter(racine, 3);
    racine = Ajouter(racine, 4);
    racine = Ajouter(racine, 2);
  
 
    System.out.println("classement");
    classement(racine);
 
    
    classement(racine);
}
}
 