package utilities;

public class CurrencyConverter {
	
    public static final double IOF = 0.06 ;
   
    public static double valueDollar;
    public static double shopping;
    public static double aux() {
    	return valueDollar * shopping * IOF + valueDollar * shopping ;
    }
}
