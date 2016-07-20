package day1.robot;

import javax.swing.JOptionPane;

public class snopper {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("What is your credit card number?");
		String live = JOptionPane.showInputDialog("Where do you live?");
		String phone = JOptionPane.showInputDialog("What is your phone number?");
		JOptionPane.showMessageDialog(null, "Your credit card number is " + number + ". Yor phone number is " + phone + ", and you live at " + live + ". Now I can rob you!");
	}
}
