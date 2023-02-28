package bagnabana;

public class ExceptionA extends Throwable{

    public ExceptionA(String Except){
       super(Except);
    }
    
    static void Divisible (int numbre) throws ExceptionA{
    	try {
			int a=3/0;
		}catch(ArithmeticException e) {
            throw new ExceptionA("Indivisible par Zero");
		}

       
    }

}
