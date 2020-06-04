package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	private JTextField answerField=new JTextField();
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		answerField.setFont(new Font("Arial",Font.PLAIN,40));
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		window.add(answerField);
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener((ActionEvent e)->{
			int first=Integer.parseInt(JOptionPane.showInputDialog("Enter the first number."));
			int second=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number."));
			answerField.setText(first+second+"");
			window.pack();
		});
		randNumber.addActionListener((ActionEvent e)->{
			answerField.setText(new Random().nextInt()+"");
			window.pack();
		});
		tellAJoke.addActionListener((ActionEvent e)->{
			answerField.setText("This is a joke.");
			window.pack();
		});
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
