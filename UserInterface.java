
import java.awt.*;
import java.util.Hashtable;

import javax.swing.*;
import javax.swing.event.*;
 
public class UserInterface {
	
	public static double BMI;
	public static int AGE;
	public static String bmi;
 
 
	
	public static void main(String[] args) {
 	
	  
    // Creating a general frame  
    JFrame generalFrame = new JFrame("BMI Calculator");
   
    generalFrame.setSize(400,200);
    generalFrame.setResizable(false);
    generalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    generalFrame.setLocationRelativeTo(null);// appear in center the frame
    generalFrame.setVisible(true);// pop ups 
   // generalFrame.getContentPane().setBackground( Color.WHITE);

    // Creating a panel 
    JPanel mainPanel = new JPanel();
    mainPanel.setBackground(Color.white);

    // Creating font style  
    Font font = new Font("Aerial", Font.PLAIN,12);
    
    // Creating labels
    JLabel label1 = new JLabel("Height (cm)"); // sliders 
    JLabel label2 = new JLabel("Weight (kg)");
    JLabel label3 = new JLabel("Age (years)");
    
    // Creating value boxes
    final JTextField valueBox1 = new JTextField(3);//value of sliders
    final JTextField valueBox2 = new JTextField(3);
    final JTextField valueBox3 = new JTextField(3);
    
    // Setting the style of value boxes 
    valueBox1.setOpaque(false);
    valueBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    valueBox1.setFont(font);
    
    valueBox2.setOpaque(false);
    valueBox2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    valueBox2.setFont(font);
    
    valueBox3.setOpaque(false);
    valueBox3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    valueBox3.setFont(font);
   
    
    Hashtable<Integer, JLabel> position = new Hashtable<Integer, JLabel>();// labeling the slider
    position.put(0, new JLabel("0"));

    position.put(50, new JLabel("50"));
    position.put(100, new JLabel("100"));
    position.put(150, new JLabel("150"));
    position.put(200, new JLabel("200"));

    
    // Creating sliders
    final JSlider slider1 = new JSlider(JSlider.HORIZONTAL,0,220,50);
    slider1.setPreferredSize(new Dimension(250,40));
    slider1.setMajorTickSpacing(50);
    slider1.setMinorTickSpacing(20);
    slider1.setPaintTicks(true);
    slider1.setPaintLabels(true);
   slider1.setLabelTable(position);

    


    final JSlider slider2 = new JSlider(JSlider.HORIZONTAL,0,220,50);
    slider2.setPreferredSize(new Dimension(250,40));
    slider2.setMajorTickSpacing(50);
    slider2.setMinorTickSpacing(10);
    slider2.setPaintTicks(true);
    slider2.setPaintLabels(true);
    slider2.setLabelTable(position);

    final JSlider slider3 = new JSlider(JSlider.HORIZONTAL,0,220,50);
    slider3.setPreferredSize(new Dimension(250,40));
    slider3.setMajorTickSpacing(50);
    slider3.setMinorTickSpacing(10);
    slider3.setPaintTicks(true);
    slider3.setPaintLabels(true);
    slider3.setLabelTable(position);

    
    
    // Object from the class Functions
    BMICalculator bmiCalculator = new BMICalculator();
    
    // Design of the message box 
    bmiCalculator.messageBox.setOpaque(true);
    bmiCalculator.messageBox.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    bmiCalculator.messageBox.setFont(font);
    bmiCalculator.messageBox.setHorizontalAlignment(JTextField.CENTER);
    
    // Design of the BMI box 
    bmiCalculator.bmiBox.setOpaque(false);
     bmiCalculator.bmiBox.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    bmiCalculator.bmiBox.setFont(font);
    bmiCalculator.bmiBox.setHorizontalAlignment(JTextField.CENTER);
     
    // Creating listeners 
    slider1.addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        valueBox1.setText("" + slider1.getValue());
        BMI = bmiCalculator.calculator(slider1.getValue(), slider2.getValue());
        AGE = slider3.getValue();
        bmiCalculator.printInfo();
        bmiCalculator.printBMI(bmiCalculator.calculator(slider1.getValue(),
        		slider2.getValue()));
      }
    });
 
    slider2.addChangeListener(new ChangeListener() {
        public void stateChanged(ChangeEvent e) {
          valueBox2.setText("" + slider2.getValue());
          BMI = bmiCalculator.calculator(slider1.getValue(), slider2.getValue());
          AGE = slider3.getValue();
          bmiCalculator.printInfo();
          bmiCalculator.printBMI(bmiCalculator.calculator(slider1.getValue(),
        		  slider2.getValue()));
        }
      });
    
    slider3.addChangeListener(new ChangeListener() {
        public void stateChanged(ChangeEvent e) {
          valueBox3.setText("" + slider3.getValue());
          BMI = bmiCalculator.calculator(slider1.getValue(), slider2.getValue());
          AGE = slider3.getValue();
          bmiCalculator.printInfo();
          bmiCalculator.printBMI(bmiCalculator.calculator(slider1.getValue(),
        		  slider2.getValue()));
        }
      });
    
    // Setting default values 
   slider1.setValue(0);
   slider2.setValue(0);
   slider3.setValue(0);

   valueBox1.setText( ""+ slider1.getValue());
    valueBox2.setText("" + slider2.getValue());
    valueBox3.setText("" + slider3.getValue());
    
    // Adding everything to the panel
    mainPanel.add(label1);
    mainPanel.add(slider1); 
    mainPanel.add(valueBox1);
    
    mainPanel.add(label2);
    mainPanel.add(slider2); 
    mainPanel.add(valueBox2);
    
    mainPanel.add(label3);
    mainPanel.add(slider3); 
    mainPanel.add(valueBox3);
    
    mainPanel.add(bmiCalculator.messageBox);
    mainPanel.add(bmiCalculator.bmiBox);
    
    // Adding panel to the frame
    generalFrame.add(mainPanel);
    generalFrame.setVisible(true);
  }
}
