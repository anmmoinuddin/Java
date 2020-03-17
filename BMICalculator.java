
import java.awt.Color;


import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class BMICalculator {
	
	// Creating constants 
	protected final int MINWEIGHT = 19;
	protected final int MAXWEIGHT_U35 = 25;
	protected final int MAXWEIGHT = 27;
	protected final int WARNWEIGHT = 30;
	
	// Creating private variables 
	private double height = 0;
	private double weight = 0;
	private double bmi = 0;
	private int age = 0;
	
	// Messages constants
		protected String underWeight = "Underweight";
		protected String normalWeight = "Looking good! Congratulation! ";
		protected String overWeight = "Overweight";
		protected String dangerousWeight = "Visit a doctor, please";
	
	// Generating getters and setters 
	public double getWeight() {
		return weight;
		}
	public void setWeight(int weight){
		this.weight = weight;
		}
	
	public double getHeight() {
		return height;
		}
	
	public void setHeight(int height) {
		this.height = height;
		}
	
	public double getBmi() { 
		return bmi; 
		}
	public void setBmi(float bmi) {	
		this.bmi = bmi;
		}
	
	public int getAge() {return age;}
	public void setAge(int age) {
		this.age = age;
		}
	
	
	// Creating the message box and bmiBox  
	final JTextField messageBox = new JTextField(40);
	final JTextField bmiBox = new JTextField(17);

	// BMI calculation
	protected double calculator(double height, double weight) {
		double BodyMassIndex = weight/Math.pow(height/100.0, 2);
		return BodyMassIndex;
	}
	
	// BMI printing
	protected void printBMI(double BodyMassIndex) {
		bmiBox.setBorder( BorderFactory.createEtchedBorder());
		bmiBox.setText("BMI:" + (int)BodyMassIndex);
		
	}
	
	// Printing the message 
	protected void printInfo() {
		if (UserInterface.BMI < 19) {
			messageBox.setBorder( BorderFactory.createLineBorder(Color.BLUE));
			messageBox.setText(underWeight);
			messageBox.setBackground(Color.LIGHT_GRAY);
		
		}
		
		else if (UserInterface.AGE < 35 && UserInterface.BMI > 19 && UserInterface.BMI < 25) {

			messageBox.setBorder( BorderFactory.createLineBorder(Color.BLUE));

			messageBox.setText(normalWeight);
			messageBox.setBackground(Color.LIGHT_GRAY);
		}
		else if (UserInterface.AGE < 35 && UserInterface.BMI > 25 && UserInterface.BMI < 30) {
			messageBox.setBorder( BorderFactory.createLineBorder(Color.BLUE));

			messageBox.setText(overWeight);
			messageBox.setBackground(Color.LIGHT_GRAY);
		}
		else if (UserInterface.AGE > 35 && UserInterface.BMI > 19 && UserInterface.BMI < 27) {
			messageBox.setBorder( BorderFactory.createLineBorder(Color.BLUE));

			messageBox.setText(normalWeight);
			messageBox.setBackground(Color.LIGHT_GRAY);
		}
		else if (UserInterface.AGE > 35 && UserInterface.BMI > 27 && UserInterface.BMI < 30) {
			messageBox.setBorder( BorderFactory.createLineBorder(Color.BLUE));

			messageBox.setText(overWeight);
			messageBox.setBackground(Color.LIGHT_GRAY);
		}
		else if (UserInterface.BMI > 30) {
			messageBox.setBorder( BorderFactory.createLineBorder(Color.BLUE));

			messageBox.setText(dangerousWeight);
			messageBox.setBackground(Color.LIGHT_GRAY);
		}
		else {
			messageBox.setText("Please select parameters to determine your BMI");	
}			messageBox.setBackground(Color.LIGHT_GRAY);

	}
	
}
