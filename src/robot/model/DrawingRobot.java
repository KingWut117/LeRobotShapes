package robot.model;

import lejos.nxt.Motor;

public class DrawingRobot
{
	
	public void driveAroundRoom()
	{
		
	}
	
	public void drawShape(int vertexCount, int length)
	{
		int angle = calculateAngle(vertexCount);
		
		for(int drawCount = 0; drawCount < vertexCount; drawCount++);
		{
			if(angle == 360)
			{
				
				try
				{
					Motor.A.setSpeed(45);
					Motor.B.setSpeed(75);
					System.out.print(Motor.A.getSpeed());
					Motor.A.forward();
					Motor.B.forward();
					Thread.sleep(length* 1000);
				}
				catch (Exception threadException)
				{
					System.out.print(threadException.getMessage());
				}
			}
			else
			{
				try
				{
					Motor.A.setSpeed(45);
					System.out.print(Motor.A.getSpeed());
					Motor.B.setSpeed(45);
					Motor.A.forward();
					Motor.B.forward();
					Thread.sleep(length* 1000);
					Motor.A.stop();
					Motor.B.stop();
					Motor.A.rotate(-angle, true);
					Motor.B.rotate(angle);	
				}
				catch(Exception threadException)
				{
					System.out.print(threadException.getMessage());
				}
			}
		}
	}
	
	public int calculateAngle(int numberOfVertices)
	{
		int currentAngle = 0;
		
		if(numberOfVertices != 0)
		{			
			currentAngle = (360/numberOfVertices);
		}
		
		return currentAngle;
	}
}
