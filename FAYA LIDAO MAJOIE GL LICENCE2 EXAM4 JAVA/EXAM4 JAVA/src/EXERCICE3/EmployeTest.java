package EXERCICE3;

public class EmployeTest {
	public static void main(String[]args) {
		try {
			Employe e1=new Employe("Faya","Lidao",29000);
			Employe e2=new Employe("Faya","Lidao",24000);
			double SalaireAnnuelE1=e1.getSalaire()*12;
			double SalaireAnnuelE2=e2.getSalaire()*12;
			System.out.println("Le Salaire Annuel de L empploye 1  est de:"+SalaireAnnuelE1+'\n'+"Le salaire Annuel de L employe 2 est de:"+SalaireAnnuelE2);
			double AugmentationE1=e1.getSalaire()*10/100;
			double AugmentationE2=e2.getSalaire()*10/100;
			e1.setSalaire(e1.getSalaire()+AugmentationE1);
			e2.setSalaire(e2.getSalaire()+AugmentationE2);
			double SalaireAnnuelE12=e1.getSalaire()*12;
			double SalaireAnnuelE22=e2.getSalaire()*12;
			System.out.println("Apres Augmentation d'un Pourcentage de 10%,Le Salaire Annuel de L empploye 1  est de:"+SalaireAnnuelE12+'\n'+"Le salaire Annuel de L employe 2 est de:"+SalaireAnnuelE22);
		} catch (NegativeSalException e) {
			e.printStackTrace();
		}
		
	}
}
