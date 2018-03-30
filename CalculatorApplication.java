 /*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Lab 10
 */

public class CalculatorApplication {

	public static void main(String[] args)
	{
		CalculatorView calcView = new CalculatorView();
		CalculatorModel calcModel = new CalculatorModel();
		CalculatorController calcControl = new CalculatorController(calcView, calcModel);
		calcView.setVisible(true);
	}
}
