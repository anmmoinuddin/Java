 
// the way to inherit a class=SubCarClass with superclass=CarClass
public class SubCarClass extends CarClass {

	// new variables which are not in the superclass=CarClass
	private float chargeInBattery;
	private String colorString;
	
	//constructor1
	public SubCarClass(){
		super();  // to get all the variables of CarClass
		
	}

	//constructor2
	public SubCarClass(String manu, String model, String key, int Cc, float fl, float charge, String col){
		//equate the variable of this constructor with superclass
		super(manu, model, key, Cc, fl);
		//new variable and assigned a name of manufacturer which was public in super class
		chargeInBattery=charge;
		colorString=col;
		manufacturerName="Jigalasting";
		
	}
	//constructor 3
	public SubCarClass(String manu, String model, String key, int Cc,  float fl, int year, float charge, String col){
		super(manu, model, key, Cc, fl, year);
		manufacturerName="gog"; //public variable
		manufacturingYear=1234;// protected variable=only accessed by inheritance
		engineCC=1890;// default variable= it can be accessed from the same package
		chargeInBattery=charge;
		colorString=col;
	}
		
	public float getChargeInBattery() {
		return chargeInBattery;
	}

	public void setChargeInBattery(float chargeInBattery) {
		this.chargeInBattery = chargeInBattery;
	}

	public String getColorString() {
		return colorString;
	}
	
@Override
	public void printallinfo() {
		
	super.printallinfo(); //invoke the superclass method then add extra things.

	/* all printmethod elements of super class + ur adding sth more. this is called overriding.*/
		 
		 //extra things
		 System.out.println("\n\n");
		 System.out.println("WHich are extra added after overriding");
		 runForSeconds(5);
		System.out.println("Amount of fuel after adding extra fuel: " + presentAmountofFuel());
		System.out.println("Charge in Battery:"+ getChargeInBattery());
		System.out.println("Color of car\t: " +  getColorString());
	 
		
	}
	 
	
}
