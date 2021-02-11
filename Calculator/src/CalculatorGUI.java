/**CalculatorGUI Class
  * The GUI View for a simple Calculator
  * Last Modified:  12/11/2020
  * @author      Shavon Thadani
 */
import javax.swing.*;
import java.awt.*;

public class CalculatorGUI extends JPanel
{
  //Instance Variables
  private Calculator calculator;               //The calculator
  
  private JLabel num1 = new JLabel("Number 1:");   //The first number in the equation
  private JTextField number1 = new JTextField(5);     
  private JLabel num2 = new JLabel("Number 2:");   //The second number in the equation
  private JTextField number2 = new JTextField(5);      
  private JLabel answer = new JLabel("",SwingConstants.CENTER); //Displays the answer to the equation
  private JButton add = new JButton("+");          //The add button
  private JButton subtract = new JButton("-");     //The subtract button
  private JButton multiply = new JButton("x");     //The multiply button
  private JButton divide = new JButton("/");       //The divide button
  private JPanel buttons = new JPanel();           //Contains all the operation buttons
  private JPanel numbers = new JPanel();           //Contains all components needed for user input
  private JPanel input = new JPanel();             //Contains all user input components
  
  /** Default constructor for the GUI.  Assigns Model and View, identifies controllers
    * and draws the layout
    * @param calc        The Model for the calculator
    */ 
  public CalculatorGUI(Calculator calc)
  {
    super();
    this.calculator = calc;
    this.calculator.setGUI(this);
    this.layoutView();
    this.registerControllers();
    this.update();
  }
  
  /** Draws the initial layout for the calculator
    */ 
  private void layoutView()
  {
    //The Buttons
    buttons.setLayout(new GridLayout(2,2));
    buttons.add(this.add);
    buttons.add(this.subtract);
    buttons.add(this.multiply);
    buttons.add(this.divide);
    buttons.setBorder(BorderFactory.createTitledBorder("Operation"));
    
    //The numbers Panel
    numbers.setLayout(new GridLayout(2,2,10,15));
    numbers.add(num1);
    numbers.add(number1);
    numbers.add(num2);
    numbers.add(number2);
    
    //The user input panel
    input.add(numbers);
    input.add(buttons);
    
    //The complete layout
    this.setLayout(new BorderLayout());
    this.add(this.input, BorderLayout.NORTH);
    this.add(this.answer, BorderLayout.CENTER);
  }
  
  /**Assigns the controllers to the operation buttons.
    */ 
  private void registerControllers()
  {
    ButtonsController controller = new ButtonsController(this.calculator, this.number1, this.number2);
    this.add.addActionListener(controller);
    this.subtract.addActionListener(controller);
    this.multiply.addActionListener(controller);
    this.divide.addActionListener(controller);
  }
  
  /** Redraws the calculator based on data provided to the calculator.  Requires data
    * from the Model.
    */ 
  public void update()
  {
    this.answer.setText(Double.toString(calculator.getAnswer()));
  }
}