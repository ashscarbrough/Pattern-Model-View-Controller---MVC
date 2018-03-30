 /*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Lab 10
 */

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class CalculatorController {

	private CalculatorView calcView;
	private CalculatorModel calcModel;
	
	public CalculatorController(CalculatorView calcView, CalculatorModel calcModel)
	{
		this.calcView = calcView;
		this.calcModel = calcModel;
		
		this.calcView.addListeners(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == calcView.buttonExit)
			{
				calcView.frame.dispose(); 
			}
			else if (e.getSource() == calcView.buttonClear)			
			{
				calcView.clearCalculator();
			}
			else {
				
	
				int firstNumber, secondNumber = 0;
				
				try 
				{
					firstNumber = calcView.getFirstNumber();
					secondNumber = calcView.getSecondNumber();
					
					if(e.getSource() == calcView.buttonAdd)
					{
							calcModel.addNumbers(firstNumber, secondNumber);
							calcView.setCalcSolution(calcModel.getCalculation());
					}
					
					if(e.getSource() == calcView.buttonSub)
					{
						calcModel.subtractNumbers(firstNumber, secondNumber);
						calcView.setCalcSolution(calcModel.getCalculation());
					}
					
					if(e.getSource() == calcView.buttonMult)
					{
						calcModel.multNumbers(firstNumber, secondNumber);
						calcView.setCalcSolution(calcModel.getCalculation());
					}
					
					if(e.getSource() == calcView.buttonDiv)
					{
						calcModel.divNumbers(firstNumber, secondNumber);
						calcView.setCalcSolution(calcModel.getCalculation());
					}
				}
				
				catch (NumberFormatException ex)
				{
					System.out.println(ex);
					calcView.displayErrorMessage("You need to enter two integers");
				}
			}
		}
	}
}
