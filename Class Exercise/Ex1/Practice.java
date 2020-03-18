package ClassExercise;

 
	import java.util.ArrayList;

	public class Practice {
		//variable
		private int i =0;
		private double average = 0;
		private double sum = 0;
		 
		//put student in the array list
		ArrayList<Student> studentinfo = new ArrayList<Student>();
		
		//constructor
		public Practice(){
			
			
		};
		//method
		public void addStudent(Student S)
		{
			studentinfo.add(S);
		}
		public double averageCal()
		{
			for (int i = 0; i < studentinfo.size(); i++)
			{
			  sum = sum + studentinfo.get(i).getGrade();
			 
			}
			average = sum/studentinfo.size();
			return average;	
		}
		
		public String toString()
		{
			String strStudent = studentinfo.get(0).getName();
			for (int i = 1; i < studentinfo.size(); i++)
			{
			  strStudent = strStudent+ " " + studentinfo.get(i).getName();
			}
			strStudent = strStudent + " " + average + " " + studentinfo.size();
			return strStudent;
		}
		

	}


