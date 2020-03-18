package currency;

public class EURO extends CurrencyV{
	// private variable
	
	private double value;
	private static double currencyrate;
	
	//constructor
	public EURO(double value){
		
		this.value=value;
	}
	//create a method to print the value
	public double printvaule(){
		return value;
	}
	
	public double dollarValue(){
		return (value*currencyrate);
		
	}
	
	//accessor method
	
	public static void setCurrencyRate(double currencyrates){
		
		currencyrate=currencyrates;
	}
	
	
// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//create an object/instance
		
		EURO myEuro=new EURO(2.54);		//constructor is used
		Yen myYen=new Yen(500);
		
		System.out.println(myEuro.printvaule());
		System.out.println(myYen.printvalue());
		
		
	}

}
