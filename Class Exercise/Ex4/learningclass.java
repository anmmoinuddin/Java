

public class learningclass {

	//private int aNumber=12;
	//private int anotherNumber;
	static private CarClass ourCar=new CarClass();   /*our car is an object*/ 
	static private CarClass ourAnotherCar=new CarClass("BMW", "Eclass", "kjdjdk", 200, 20, 2011);
	static private CarClass thirdCar=new CarClass();
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//3rd constructor
  ourAnotherCar.printallinfo();
	 
	 //new line
	 System.out.println("\n");
		
	 //first constructor is used where no value is assigned
	 ourCar.printallinfo();
		
	 //new line
	 System.out.println("\n");
	 
	 // 3rd car
	
	thirdCar.printallinfo();	
	 
	//new line
	 System.out.println("\n");
	 
	/*subcar==here i used 2nd constructor but u can also use 3. while giving the input remember how many variables were used 
	 in constructor 3.for exampel
	  SubCarClass newSub=new SubCarClas(String manu, String model, String key, int Cc,  float fl, int year, float charge, String col)*/
	
	 SubCarClass ourSubCar=new SubCarClass("BMW", "7Series", "zwer", 3000, 25, 10, "Gray" );
	
		 

		System.out.println("---Manufacturer:" +ourSubCar.manufacturerName);
		System.out.println("---Modelname:" +ourSubCar.getModelName());
		System.out.println("Password Match: " +ourSubCar.matchPassword("jkjdfkjsd"));
		System.out.println("Password Match: " +ourSubCar.engineCC);
		System.out.println("Amount of fuel: " +ourSubCar.presentAmountofFuel());
		ourSubCar.addFuel(2);
		System.out.println("Amount of fuel after adding extra fuel: " +ourSubCar.presentAmountofFuel());
		ourAnotherCar.runForSeconds(560);
		System.out.println("Amount of fuel after adding extra fuel: " +ourSubCar.presentAmountofFuel());
		System.out.println("Charge in Battery:"+ourSubCar.getChargeInBattery());
		System.out.println("Color of car\t: " + ourSubCar.getColorString());
	 
		 System.out.println("\n\n");
	ourSubCar.printallinfo();
}

}
