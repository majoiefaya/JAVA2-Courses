package dms42;


class ABT
{

static class Noeud
{
    int data;
    Noeud gauche, droit;
};
 
 
///Recuper Un Nouveau Noeud
static Noeud getNoeud(int data)
{

    Noeud newNoeud = new Noeud();

    newNoeud.data = data;
    newNoeud.gauche = newNoeud.droit = null;
    return newNoeud;
}

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
 
static Noeud ConstructionDuBST(int arr[], int n)
{
    if(n == 0)return null;
    Noeud racine = null;
 
    for(int i = 0; i < n; i++)
    racine = classement(racine , arr[i]);
     
    return racine;
}

 
// 
public static void main(String args[])
{
    int arr[] = {5, 0, 1, 2, 9, 4};
    int n = arr.length;
     
    Noeud racine = ConstructionDuBST(arr, n);
}
}