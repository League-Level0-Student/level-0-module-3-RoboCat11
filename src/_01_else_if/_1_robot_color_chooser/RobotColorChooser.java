
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.penDown();

		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String input = JOptionPane.showInputDialog("What color pen would you like to use?");
		//5. Use an if/else statement to set the pen color that the user requested
		if(input.equals("teal")) {
			
		
        //6. If the user doesn't enter anything, choose a random color
		rob.setPenColor(0,250,255);
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		for(int i = 0; i<4; i++) {
		rob.move(90);
		rob.turn(90);
	
	
		}
		}
		String input2 = JOptionPane.showInputDialog("What color pen would you like to use?");
		if(input.equals("red")) {
		rob.setPenColor(200,0,0);
		for(int i = 0; i<4; i++) {
		rob.move(90);
		rob.turn(90);
		
		
		}
		}
		String input3 = JOptionPane.showInputDialog("What color pen would you like to use?");
		if(input.equals("green")) {
		rob.setPenColor(0,200,0);	
		for(int i = 0; i<4; i++) {
		rob.move(90);
		rob.turn(90);
		
			
		}
		}
		String input4 = JOptionPane.showInputDialog("What color would you like to use?");
		if(input.equals("blue")) {
		rob.setPenColor(0,0,200);
		for(int i = 0; i<4; i ++) {
		rob.move(90);
		rob.turn(90);
		}
		}

	}
}
