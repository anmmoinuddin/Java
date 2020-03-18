package currency;

public class USDollar extends CurrencyV {
	
	//private variable
	private double value;
	private static double currencyrate;
	
	//Constructor
	public USDollar(double value){
		this.value=value;
		
	}
	
	//create a method to print the value
	public double printvalue(){
		return value;
	}
	
	// overriding the abstract method of abstract class CurrencyV

	public double dollarValue(){
		return value;
		
	}
	
	// Use Encapsulation or accessor method
	//getmethod
	public double getCurrencyRate(){
		return currencyrate;
		
	}
	//setmethod
	public void setCurrrencyRate(double currencyrates){
		currencyrate=currencyrates;
	}
	
}
