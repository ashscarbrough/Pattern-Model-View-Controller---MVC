 
 /* Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Lab 10
 */

public class CalculatorModel {

	private int calculation;
	
	public void addNumbers(int firstNumber, int secondNumber)
	{
		calculation = firstNumber + secondNumber;
	}
	
	public void subtractNumbers(int firstNumber, int secondNumber)
	{
		calculation = firstNumber - secondNumber;		
	}
	
	public void multNumbers (int firstNumber, int secondNumber)
	{
		calculation = firstNumber * secondNumber;
	}
	
	public void divNumbers (int firstNumber, int secondNumber)
	{
		calculation = firstNumber / secondNumber;
	}
	
	public int getCalculation()
	{
		return calculation;
	}
}
