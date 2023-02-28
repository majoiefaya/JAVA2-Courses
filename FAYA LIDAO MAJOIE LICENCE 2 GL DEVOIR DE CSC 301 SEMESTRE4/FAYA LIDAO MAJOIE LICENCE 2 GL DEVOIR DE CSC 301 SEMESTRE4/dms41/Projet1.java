package dms41;

public class Projet1 {
/*
 * 1
 */
 public static String ds=new String("salu");
 public static void main(String[] devoir) {
	 Projet1 projet=new Projet1();
	 projet.composer(ds);
	 
 }
 /*
  * une methode static ne peut pas utiliser une variable non Static
	Il suffit donc juste ici de ramener la variable ds a Static pour que les 2 methodes Statiques Main et Composer puissent l utiliser 
  */
 public static void composer(String chaine) {
	 System.out.println(ds);
 }
 
 public String fn(String NombreEntier) {
	 return NombreEntier;
 }
 /*La Methode fn est de Type int mais retourne une valeur de type String;
  * Il faut soit Changer le type du Parametre de La Methode fn soit changer Le Type de La Methode
  * pour que le type de La Mehode et le type du parametre soient equivalents
  * Ici j ai changer le type de la fonction en String
  */
 
 
 /*
  * 
  */
}
