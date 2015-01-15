package robot.model;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;

public class RoomRoamRobot
{
	private TouchSensor touchSensor;
	
	private UltrasonicSensor distanceSensor;
	
	private SoundSensor soundSensor;
	
	public RoomRoamRobot()
	{
		touchSensor = new TouchSensor(SensorPort.S1);
		
		distanceSensor = new UltrasonicSensor(SensorPort.S2);
		
		soundSensor = new SoundSensor(SensorPort.S3);
	}
	
	public void driveAroundRoom()
	{
		try
		{
			Motor.A.setSpeed(45);
			System.out.print(Motor.A.getSpeed());
			Motor.B.setSpeed(45);
			Motor.A.forward();
			Motor.B.forward();
			Thread.sleep(5000);
			Motor.A.stop();
			Motor.B.stop();
		}
		catch(Exception threadException)
		{
			System.out.print(threadException.getMessage());
		}
		
		
		if(touchSensor.isPressed())
		{
			turnFromObject();
		}
		
		if(distanceSensor.getDistance() <= 25 )
		{
			turnFromObject();
		}
		
		if(soundSensor.readValue() >= 50 )
		{
			danceRobotDance();
		}
		
		
	}
	
	public void turnFromObject()
	{
		try
		{
			Motor.A.setSpeed(45);
			Motor.B.setSpeed(75);
			System.out.print(Motor.A.getSpeed());
			Motor.A.backward();
			Motor.B.backward();
			Thread.sleep(2500);
			Motor.A.stop();
			Motor.B.stop();
		}
		catch (Exception threadException)
		{
			System.out.print(threadException.getMessage());
		}
	}
	
	public void danceRobotDance()
	{
		try
		{
			Motor.A.setSpeed(45);
			Motor.B.setSpeed(75);
			System.out.print(Motor.A.getSpeed());
			Motor.A.backward();
			Motor.B.backward();
			Thread.sleep(2500);
			Motor.A.stop();
			Motor.B.stop();
			
			Thread.sleep(1000);
			
			Motor.A.setSpeed(75);
			Motor.B.setSpeed(45);
			System.out.print(Motor.A.getSpeed());
			Motor.A.forward();
			Motor.B.forward();
			Thread.sleep(2500);
			Motor.A.stop();
			Motor.B.stop();
			
			Thread.sleep(1000);
			
			Motor.A.setSpeed(45);
			Motor.B.setSpeed(75);
			System.out.print(Motor.A.getSpeed());
			Motor.A.forward();
			Motor.B.forward();
			Thread.sleep(2500);
			Motor.A.stop();
			Motor.B.stop();
			
			Thread.sleep(1000);
			
			Motor.A.setSpeed(75);
			Motor.B.setSpeed(45);
			System.out.print(Motor.A.getSpeed());
			Motor.A.backward();
			Motor.B.backward();
			Thread.sleep(2500);
			Motor.A.stop();
			Motor.B.stop();
		}
		catch (Exception threadException)
		{
			System.out.print(threadException.getMessage());
		}
	}

}
