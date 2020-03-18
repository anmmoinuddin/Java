
public class Human {
	
//variable declaration like C
	//private variable which can only be accessed within this class. cannot be accessed from 
	//another class
	
	private int age;
	private boolean IsMale;
	private String FirstName;
	private String Name;
	
// Constructor=it has no return type
	public Human(int age, boolean IsMaleX, String FirstName, String Name){
	/* you can use the same name inside a constructor,  like age but before that put "this". 
	   so d system can differentiate*/
		
		this.age=age;
		this.IsMale=IsMaleX;
		this.FirstName=FirstName;
		this.Name=Name;
		
	}
	
//Accessor Method
	//*An accessor method is used to return the value of a private field. 
		/* as variables are declared as private it cannot be accessed from another class
  		to get access we will use accessor method*/
	 
	//Accessor for age=
	 /* modifier returntype Name(parameter), 
	it will return integer type*/
	
	public int getAge(){
		return age;
		}
	
	// the name getisMale should be different from IsMale
	public boolean getisMale(){
		return IsMale;
	}
	
	public String getfirstName(){
		return FirstName;
	}
	
	public String getname(){
		return Name;
	}


	
// Mutuator =A mutator method is used to set a value of a private field. 
	
	public void setage(int newage){
		
		this.age=newage;
	}
	public void setfirstname(String firstName){
		this.FirstName=firstName;
	}
	public void setname(String name){
		this.Name=name;
		
	}
	
	// create a method for boolean IsMale
	
		public String toString(){		//modifier return_type Name(parameter), 
			String gender;
			if(getisMale())
				gender="Male";
			else
				gender="female";
		 
			//" " > for space  and "+" for concatenation 
			String strHuman=FirstName+ " " + Name+ " " + " " + gender+ "" + "Age"+ " "+ age;
				return strHuman;
		}
	
	//
		
 
 public boolean olderthan(Human h){
	 return (this.age>h.getAge());
 }
}
	