package Lista7;

import javax.swing.*;
import java.awt.*;

public class Kalkulator {
	
	private JFrame frame; /// just window
	private JPanel panel; /// displays all components
	JTextArea display = new JTextArea(2, 10);
	
	/// BUTTONS ///
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_10;
	private JButton btn_11;
	private JButton btn_12;
	private JButton btn_13;
	private JButton btn_14;
	private JButton btn_15;
	
	public Kalkulator()
	{
		gui();
	}
	
	public void gui()
	{
		/// FRAME ///
		frame = new JFrame("Calculator");
		frame.setVisible(true);
		frame.setSize(350,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// closing frame
		
		/// PANEL ///
		panel = new JPanel(new GridBagLayout()); ///to arrange things
		panel.setBackground(Color.white);
		
		/// BUTTONS ///
		btn_1 = new JButton("0");
		btn_2 = new JButton("1");
		btn_3 = new JButton("2");
		btn_4 = new JButton("3");
		btn_5 = new JButton("4");
		btn_6 = new JButton("5");
		btn_7 = new JButton("6");
		btn_8 = new JButton("7");
		btn_9 = new JButton("8");
		btn_10 = new JButton("9");
		btn_11 = new JButton("+");
		btn_12 = new JButton("-");
		btn_13 = new JButton("*");
		btn_14 = new JButton("/");
		btn_15 = new JButton("=");
		
		panel.add(btn_1);
		panel.add(btn_2);
		panel.add(btn_3);
		panel.add(btn_4);
		panel.add(btn_5);
		panel.add(btn_6);
		panel.add(btn_7);
		panel.add(btn_8);
		panel.add(btn_9);
		panel.add(btn_10);
		panel.add(btn_11);
		panel.add(btn_12);
		panel.add(btn_13);
		panel.add(btn_14);
		panel.add(btn_15);

		
		/// CREATE WINDOW ///
		frame.add(panel);
		frame.add(display);		
		
		double num1, num2, result;
		int add = 0, mult = 0, div = 0, sub = 0;
	}
	
	public static void main(String[] args) {

	new Kalkulator();
		
		
	}

}
