package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		Robot Max = new Robot();
		Max.penDown();
		Max.setSpeed(100);
		Max.setPenColor(255, 0, 0);
		Max.setPenWidth(50);
		for (int i = 0; i < 9; i++) {
			Max.move(100);
			Max.turn(80);
			
		}
		Max.penUp();

	
		
		
	}
}
