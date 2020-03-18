package ClassExercise;

import java.util.ArrayList;


	public abstract class CheckArrayList {

		public static void main(String[] args)
		{
			ArrayList<String> mylist = new ArrayList<String>();
			
			mylist.add("Apple");
			mylist.add("Peach");
			mylist.add("table");
			mylist.add("banana");
			mylist.add("lemon");
			
			
			System.out.println(mylist.toString());
			
			mylist.remove("table");
			
			System.out.println(mylist.toString());
			
			if(mylist.contains("Apple"))
			 {
				System.out.println("yes");
			 }
			
			else
			 {
				System.out.println("no");
			 }
			
			System.out.println(mylist.get(1));
			System.out.println(mylist.size());
			
		}
	
}



