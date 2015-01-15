package robot.controller;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import robot.model.DrawingRobot;

public class LeRobotController
{
	private DrawingRobot myBot;
	
	public LeRobotController()
	{
		myBot = new DrawingRobot();
	}
	
	public void start()
	{	
		while(Button.waitForAnyPress() != Button.ID_ESCAPE)
		{
			System.out.print(Motor.A.getSpeed());
			drawSquare();
		
			drawTriangle();
			
			drawHexagon();
			
			drawOctagon();
		
			drawCircle();
		
			myBot.driveAroundRoom();
		}
	}
	
	public void drawSquare()
	{
		myBot.drawShape(4, 2);
	}
	
	public void drawTriangle()
	{
		myBot.drawShape(3, 2);
	}	
	
	public void drawCircle()
	{
		myBot.drawShape(1, 5);
	}
	
	public void drawHexagon()
	{
		myBot.drawShape(6, 2);
	}
	
	public void drawOctagon()
	{
		myBot.drawShape(8, 2);
	}	
	
}
