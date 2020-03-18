
public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//this is the main functions . from here you can create ur instances of class.
/*for example, in C what we do> declare int b likewise here
you created human class. so  int=class name(here Human) so this the type int.
then u can set the name. >here dave.


int c= Human dave. 
new Human(here you give the value of the variable that u set in the constructor)*/
		
		
		Human dave=new Human(14, true, "Dave", "DeCosta");
		Human h1=new Human(20,false,"Linda","Miller");
		
		System.out.println(dave.getfirstName()); 
/*here if u type FirstName like dave.FirstName. it will not come.
cause private.so use accessor method.*/
		
		System.out.println(dave.getname());
		System.out.println(dave.getAge());
		System.out.println(dave.getisMale());
		System.out.println(h1.toString());
		
		//for new line
		System.out.println("\n");
		//concatenate>>>> + is used to conatenate
		System.out.println(dave.getfirstName() + " " + dave.getname() +  " " + dave.getAge());
		
		System.out.println();
		
		System.out.println(h1.getfirstName());
		System.out.println(h1.getname());
		System.out.println(h1.getAge());
		System.out.println(h1.getisMale());
		System.out.println(h1.toString());
		
		System.out.println("\n");
		System.out.println(h1.toString());
		 
		System.out.println("\n");
		System.out.println(h1.olderthan(dave));

	}

}
