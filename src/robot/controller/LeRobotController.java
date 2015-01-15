package robot.controller;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import robot.model.DrawingRobot;
import robot.model.RoomRoamRobot;

public class LeRobotController
{
	private DrawingRobot myBot;
	
	private RoomRoamRobot roomBot;
	
	public LeRobotController()
	{
		myBot = new DrawingRobot();
		
		roomBot = new RoomRoamRobot();
	}
	
	public void start()
	{	
		while(Button.waitForAnyPress() != Button.ID_ESCAPE)
		{
			//Uncomment the program you want to run
			
			//drawAllShapes();
			
			//roamRoom();
		}
	}
	
	public void roamRoom()
	{
		while(Button.waitForAnyPress() != Button.ID_ESCAPE)
		{
			roomBot.driveAroundRoom();
		}
	}
	
	public void drawAllShapes()
	{
		System.out.print(Motor.A.getSpeed());
		drawSquare();
	
		drawTriangle();
		
		drawHexagon();
		
		drawOctagon();
	
		drawCircle();
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
