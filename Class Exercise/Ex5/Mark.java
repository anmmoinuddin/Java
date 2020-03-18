package currency;


public class Mark extends EURO{

	//private variable
	
	private double value;
	
	//final means u cannot change it. it is fixed once the value is assigned
	private final static double currencyrate=1.96;
	
	//constructor
	public Mark(double value){
	super(value/currencyrate);
	
	}
	
	//create a method to convert euro to Deutsche Mark
	public double EuroToDM(double euro){
		double dm;
		dm=currencyrate*euro;
		return dm;
		
	}
	
	}

