/** Calculator Class
*  Creates a simple calculator that allows the user to add/subtract/multiply/divide any two numbers
*  Last Modified:  12/11/2020
*  @author Shavon Thadani
*/
public class Calculator extends Object
{
  //Variable Declarations
  private CalculatorGUI calcView;          //The view for the calculator
  private double number1;                  //The first number in the calculation
  private double number2;                  //The second number in the calculation
  private double answer;                   //The solution to the calculation
  
  /** Creates a default calculator
    */
  public Calculator()
  {
    super();
    this.number1 = 0;
    this.number2 = 0;
    this.answer = 0;
  }
  
  /** Sets the view for the calculator
    * @param currentGUI        The View used to display the calculator
    */ 
  public void setGUI(CalculatorGUI currentGUI)
  {
    this.calcView = currentGUI;
  }
  
  /** Get the first number of the calculation
    * @return first number of the calculation*/
  public double getNumber1()
  {
    return this.number1;
  }
  
  /** Get the second number of the calculation
    * @return second number of the calculation*/
  public double getNumber2()
  {
    return this.number2;
  }
  
  /** Get the answer to the calculation
   * @return answer to the calculation*/
  public double getAnswer()
  {
    return this.answer;
  }

  /** Sets the value of the first number in the calculation to the argument provided*/
  public void setNumber1(double number)
  {
    this.number1 = number;
  }
  
  /** Sets the value of the second number in the calculation to the argument provided*/
  public void setNumber2(double number)
  {
    this.number2 = number;
  }
  
   /**Calculates the solution to the equation
    * @param the operation to perform
    * + --> addition
    * - --> subtraction
    * x --> multiplication
    * / --> division*/
  public void calculate(String operation)
  {
    char op = operation.charAt(0); //The operation to perform
    
    switch(op)//Perform calculation based on currrent operation
    {
      case '+': //add
        this.answer = this.number1 + this.number2;
        break;
      case '-': //subtract
        this.answer = this.number1 - this.number2;
        break;
      case 'x': //multiply
        this.answer = this.number1 * this.number2;
        break;
      case '/': //divide
        this.answer = this.number1 / this.number2;
        break;
      default: //error
        this.answer = 0;
    }
    this.updateView();
  }
  
  /**  Updates the view in the GUI*/
  public void updateView()
  {
    calcView.update();
  }
}