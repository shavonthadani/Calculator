import javax.swing.*;

/**  Calculator Program
*    Creates a simple calculator that allows the user to add/subtract/multiply/divide any two numbers
*    Last Modified: 12/11/2020
*    @author Shavon Thadani
*/ 
public class CalculatorProgram
{
  public static void main (String [] args)
  {
    Calculator calc = new Calculator();            //The calculator
    CalculatorGUI main = new CalculatorGUI(calc);  //The calculator view
    
    //Initialize the Frame
    JFrame f = new JFrame("Calculator");
    f.setSize(500,500);
    f.setLocation(300,200);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setContentPane(main);
    f.setVisible(true);
  }
}