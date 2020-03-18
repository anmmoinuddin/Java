package ClassExercise;
import java.util.ArrayList;
public class TestLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 

 
 

	 
		Student Bill = new Student("Bill",1.0);
		Student Max = new Student("Max",2.8);
		
		Practice OPP = new Practice();
		OPP.addStudent(Bill);
		OPP.addStudent(Max);
		
		System.out.println("Average point is " + OPP.averageCal());
		System.out.println("Students are " + OPP.toString());
		
	}
}
