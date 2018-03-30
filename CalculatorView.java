 /*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Lab 10
 */

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame{

	
	JFrame frame;
	JPanel panel;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JTextField firstNumber;
	JTextField secondNumber;
	JTextField endResult;
	JButton buttonAdd;
	JButton buttonSub;
	JButton buttonMult;
	JButton buttonDiv;
	JButton buttonClear;
	JButton buttonExit;
	
	public CalculatorView()
	{
		frame = new JFrame("Calculator");
		frame.setSize(500,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel =new JPanel();
		Box box = Box.createVerticalBox();
		Box box1 = Box.createHorizontalBox();
		Box box2 = Box.createHorizontalBox();
		Box box3 = Box.createHorizontalBox();
		Box box4 = Box.createHorizontalBox();

		label1 = new JLabel("Number 1: \n");
		label2 = new JLabel("Number 2: \n");
		label3 = new JLabel("Result: \n");
		firstNumber = new JTextField(15);
		secondNumber = new JTextField(15);
		endResult = new JTextField(15);
		endResult.setEditable(false);
		buttonAdd = new JButton("Add");
		buttonSub = new JButton("Subtract");
		buttonMult = new JButton("Multiply");
		buttonDiv = new JButton("Divide");
		buttonClear = new JButton("Clear");
		buttonExit = new JButton("Exit");

		box1.add(label1);
		box1.add(firstNumber);
		box2.add(label2);
		box2.add(secondNumber);
		box3.add(label3);
		box3.add(endResult);
		box4.add(buttonAdd);
		box4.add(buttonSub);
		box4.add(buttonMult);
		box4.add(buttonDiv);
		box4.add(buttonClear);
		box4.add(buttonExit);
		
		box.add(box1);
		box.add(box2);
		box.add(box3);
		box.add(box4);
		
		panel.add(box);
		frame.add(panel);
		frame.setVisible(true);
	}
	
	public int getFirstNumber()
	{
		return Integer.parseInt(firstNumber.getText());
	}

	public int getSecondNumber()
	{
		return Integer.parseInt(secondNumber.getText());
	}
	
	public int getCalcSolution()
	{
		return Integer.parseInt(endResult.getText());
	}
	
	public void setCalcSolution(int solution)
	{
		endResult.setText(Integer.toString(solution));
	}
	
	public void clearCalculator()
	{
		firstNumber.setText("");
		secondNumber.setText("");
		endResult.setText("");
	}
	
	void addListeners (ActionListener listenForButtons)  //////////////////////
	{
		buttonAdd.addActionListener(listenForButtons);
		buttonSub.addActionListener(listenForButtons);
		buttonMult.addActionListener(listenForButtons);
		buttonDiv.addActionListener(listenForButtons);
		buttonClear.addActionListener(listenForButtons);
		buttonExit.addActionListener(listenForButtons);
	}
	
	void displayErrorMessage(String errorMessage)
	{
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
