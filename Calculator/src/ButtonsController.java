import javax.swing.*;
import java.awt.event.*;

/** ButtonsController class
  * The controller for the mathematical operations buttons
  * LastModified:  12/11/2020
  * @author  Shavon Thadani
  */ 
public class ButtonsController implements ActionListener
{
  private Calculator calc;        //The Model used for the calculator
  private JTextField number1;     //The first number in the equation
  private JTextField number2;     //The second number in the equation
  
  /** Default constructor
    * Links the component to the Model
    * @param calculator   The current Calculator model
    * @param number1;     The first number in the equation
    * @param number2;     The second number in the equation
    */ 
  public ButtonsController(Calculator calculator, JTextField number1, JTextField number2)
  {
    this.calc = calculator;
    this.number1 = number1;
    this.number2 = number2;
  }
  
  /** Performs the requested calculation
    * @param e      The event sent from the button that was clicked
    */ 
  public void actionPerformed(ActionEvent e)
  {
    //Variable declaration
    double num1;        //The first number in the equation
    double num2;        //The second number in the equation
    
    //Get the first number
    try{
      num1 = Double.parseDouble(this.number1.getText());
      this.calc.setNumber1(num1);
    } catch (NumberFormatException ex)
    {
      this.number1.setText("Invalid");
    }
    
    //Get the second number
    try{
      num2 = Double.parseDouble(this.number2.getText());
      this.calc.setNumber2(num2);
    } catch (NumberFormatException ex)
    {
      this.number2.setText("Invalid");
    }
    
    //Perform the calculation
    if(!number1.getText().equals("Invalid")&&!number2.getText().equals("Invalid"))
    {
      this.calc.calculate(e.getActionCommand());
    }
    else
      this.calc.calculate("error");
  }
}
