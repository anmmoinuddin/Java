package currency;

public class Yen extends CurrencyV {
	
	private double value;
	private static double currencyrate;
	
	
	//Constructor
	public Yen(double value){
		this.value=value;
		
	}
	//create a method to print the value
	public double printvalue(){
		return value;
	}
	
	// overriding the abstract method of abstract class CurrencyV

	public double dollarValue(){
		return (value*currencyrate);
		
	}
	// accessor method
public double getCurrencyRate(){
	return currencyrate;
} 

public static void setCurrencRate(double currencyrates){
	currencyrate=currencyrates;
	
}


}
