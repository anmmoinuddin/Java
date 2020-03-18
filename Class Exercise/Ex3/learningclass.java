

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
		}
}
