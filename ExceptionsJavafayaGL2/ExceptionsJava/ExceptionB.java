package bagnabana;

public class ExceptionB extends ExceptionA{

    public ExceptionB(String Except) {
        super(Except);
        
    }

     static void DivisibleParZeroB (int numbre) throws ExceptionB{
    	 try {
 			int a=numbre/0;
 		}catch(ArithmeticException e) {
             throw new ExceptionB("Ce nombre est Indivisible par Zero Type B");
 		}
    }
    
}
