package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeorNot {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Enter a number");
		int number = Integer.parseInt(answer);
			for (int i = 2; i < number; i++) {
				
				if (number%i==0) {
					JOptionPane.showMessageDialog(null, "This is not a prime number");
					System.exit(0);
				}	
			}
			JOptionPane.showMessageDialog(null, "This is a prime number");
		}
	}

