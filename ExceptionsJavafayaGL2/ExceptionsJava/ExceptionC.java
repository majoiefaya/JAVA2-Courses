package bagnabana;


public class ExceptionC extends ExceptionB{

    public ExceptionC(String Except) {
        super(Except);
      
    }
    
    static void DivizibleParZeroC (int numbre) throws ExceptionC{

   	 try {
			int a=numbre/0;
		}catch(ArithmeticException e) {
          throw new ExceptionC("Ce nombre est Indivisible par Zero TypeC");
		}
    }
}
