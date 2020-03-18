package ClassExercise;

public class Student {
 
		//variable
		private String name;
		private double grade;
		
		//constructor
		public Student(String namex, double gradex)
		{
			this.name = namex;
			this.grade = gradex;
		}
		
		//accessor method
		public double getGrade()
		{
			return grade;
		}
		
		public String getName()
		{
			return name;
		}
	}
 
