package _01_algorithms._2_fibonacci;

public class Algorithms {
	public static void main(String[] args) {
		int number1 = 0;
		System.out.println(number1);
		int number2 = 1;
		System.out.println(number2);
		int sum = number1;
		for (int i = 0; i < 10; i++) {
			sum = number1 + number2;
			number1 = number2;
			number2 = sum;
			System.out.println(sum);
		}
		
	}
}
