package bagnabana;

import java.util.Scanner;
public class Execute {
	 public static void main(String[] args) throws ExceptionA {
	  
	      
	      Scanner enter=new Scanner(System.in);

	      System.out.println("Entrer un nombre : ");
	      int numbre=enter.nextInt();

	

	      try {
	         new ExceptionB("");
			ExceptionA.Divisible(numbre);
	      } catch (Exception e) {
	        System.out.println(e);
	      }

	      
	    }
}



