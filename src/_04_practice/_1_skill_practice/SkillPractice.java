package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		          	skills.skill1();
		          	skills.skill2();
		          	skills.skill3();
		          	skills.skill4();
		          	skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
			//String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
			


		// Tell them how many cents they have (hint multiply by 10)
			//int num = Integer.parseInt(dimes)*10;
			
			//JOptionPane.showMessageDialog(null, "You have "+num +" cents");



		// Ask the user how tall they are (inches)
			//String inches = JOptionPane.showInputDialog("How tall are you in inches?");
			//int inch = Integer.parseInt(inches);


		// If they are shorter than 36 inches, tell them to eat their Wheaties
			//if(inch<36) {
				//JOptionPane.showMessageDialog(null, "You should eat more Wheaties.");
			//}



		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
			//for (int i = 1; i < 31; i++) {
				//if(i%3==0) {
				//	System.out.println(i);
				//}
			//}

			




		}

		void skill3() { // Get a random number that is less than 20 and print it to the console 
			//int random = new Random().nextInt(20);
			//System.out.println(random);

		// Get another random number that is less than 10 and print it to the console 
			//int number = new Random().nextInt(10);
			//System.out.println(number);

		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
			//int total= random - number;
			//JOptionPane.showMessageDialog(null, "The diference between " +random +" and " +number +" is " +total);


		}

		void skill4() { // In a pop-up, ask the user for the city they live in 
			//String answer = JOptionPane.showInputDialog("What city do you live in?");


		// If they answered "San Diego", tell them they live in America's Finest City 
			//if(answer.equals("San Diego")) {
				//JOptionPane.showMessageDialog(null, "You live in America's Finest City");
			//}else {
				//JOptionPane.showMessageDialog(null, "You should consider moving to San Diego");
			//}


		// Otherwise, tell them to move to San Diego 



		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
			//int cars = 5;

			//if (cars==0) {
				//JOptionPane.showMessageDialog(null, "I bet you use public transportation");
			//}
		// If there is 1 car, use a pop-up to display the make/model of the car 
			//else if(cars==1){
				//JOptionPane.showMessageDialog(null, "2017 Honda Civic sedan");
		//	}


		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
			//else if(cars>=1) {
				//int total = cars * 4;
				//JOptionPane.showMessageDialog(null, "Your cars have "+total +" wheels between them");
			//}


		}

		void skill5() { // In a pop-up, ask the user for the name of their school 

			//String answer = JOptionPane.showInputDialog("What is the name of your school?");
			
		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
			//JOptionPane.showMessageDialog(null, "Your school, "+answer +", is a fanstastic school and I hope you're learning a lot over there!");


		}
}
