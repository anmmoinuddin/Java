
 public class CarClass {
	
	//public variables
	public String manufacturerName;
	
	//private variables
	private String modelName;
	private String carKeyValue;
	
	//default variable
	int engineCC;		// default it can be used in d whole package
	 
	//protected
	protected int manufacturingYear;
	
	private float fuelAmount;
	final private float amountOfFuelConsumedPerSecond=0.02f;
	
	//default constructor=initialize with blank values
	
	public CarClass(){
		
		manufacturerName=new String();   // they way to assign a string>new string()
		modelName=new String();
		engineCC=0;
		 
		fuelAmount=0;
		manufacturingYear=0;
	}
	//constructor with parameter
	 
	public CarClass(String carName){
		manufacturerName=new String(carName);
		modelName=new String();
		engineCC=0;
		 
		fuelAmount=0;
	}
	public CarClass(String manu, String model, String key, int engineCC, float fuel ){
		manufacturerName=manu;
		modelName=model;
		carKeyValue=key;
		this.engineCC=engineCC;  //this is written to quote engine of a class
		fuelAmount=fuel;
		manufacturingYear=0;
	}
	
	public CarClass(String manu, String model, String key, int engineCC, float fuel, int year ){
	this(manu, model, key, engineCC,fuel);
	manufacturingYear=year;
	}
		
	public float presentAmountofFuel(){
		
		return fuelAmount;
	}
	public String getManufacturerName(){
		return manufacturerName;
	}
	
	public String getModelName(){     
		/*coz modelname is set as private it cannot be 
		accessed from another class. so getmodelname can be used*/
		return modelName;
	}
	
	public void addFuel(float fuelAmount){
		this.fuelAmount+=fuelAmount;
	}
	
	public void runForSeconds(int timeInSecond){
		float usedFuel=timeInSecond*amountOfFuelConsumedPerSecond;
		fuelAmount-=usedFuel;
		
	}
	public boolean matchPassword(String userInput){
		return userInput.equals(carKeyValue);
	}
	//create a  method to print
	public void printallinfo() {
		System.out.println("---Manufacturer:" + manufacturerName);
		System.out.println("---Modelname:" + getModelName());
		System.out.println("Password Match: " + matchPassword("jkjdfkjsd"));
		System.out.println("Amount of fuel: " + presentAmountofFuel());
		addFuel(2);
		System.out.println("Amount of fuel after adding extra fuel: " + presentAmountofFuel());
			
	
		
	}
	 
	
}
