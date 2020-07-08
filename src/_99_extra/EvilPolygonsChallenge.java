package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot shapes = new Robot();
		//2. Set the speed to 100
		shapes.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "Colors", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Green", "Blue", "Random"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
			if(colorChoice==(0)) {
				shapes.setPenColor(Color.red);
			}else if(colorChoice==(1)) {
				shapes.setPenColor(Color.green);
			}else if(colorChoice==(2)) {
				shapes.setPenColor(Color.blue);
			}else if(colorChoice==(3)) {
				shapes.setRandomPenColor();
			}
		//4. Ask the use how many polygons they want to be drawn.
		String answer = JOptionPane.showInputDialog("How may polygons would you like?");
		//5. Use the robot to draw the number of polygons the user requested.
		
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

