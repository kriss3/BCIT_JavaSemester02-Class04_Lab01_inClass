package pl.kriss3.bcit1451.class04;

import java.util.Random;

/**
 * Mathematic class to play with JUnit framework;
 * @author kszczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-Class04_Lab01_inClass.git
 */
public class Mathematics 
{
	public static final double ONE_FOOT_TO_KILOMETER_RATIO = 0.0003048;
	public static final double PI = 3.14159;

	//Done
	public static double getCircleArea(double value)
	{
		double result = -1;
		if(value > 0)
			result = PI * (value * value);
		return result;
	}
	
	//Done
	public double getSquareArea(double value)
	{
		return value * value;
	}
	
	//Done
	public double add(double val1, double val2)
	{
		return val1 + val2;
	}
	
	//Done
	public double times(double val1, double val2)
	{
		return val1 * val2;
	}
	
	//Done
	public double subtract(double val1, double val2)
	{
		return val1 - val2;
	}
	
	//Done
	public int divide(double val1, double val2)
	{
		int result = 0;
		if(val2 != 0)
		{
			result = (int)(val1 / val2);
		}
		return result;
	}
	
	//Done
	public int absoluteValue(int val)
	{
		int result = val;
		if(val < 0)
			result = Math.abs(val);
		return result;
	}
	
	//Done
	public int getRandomNumberBetweenTenAndTwentyButNotFifteen()
	{
		int low = 10;
		int high = 20;
		int exception = 15;
		Random rnd = new Random();
		int result = 0;
		
		do
		{
			result = rnd.nextInt((high - low) + 1) + low ;
		} while (result == exception);
			
		return result;
	}
	
	//Done
	public double convertFeetToKilometers(double val)
	{
		double result = -1;
		if(val > 0)
			result = val * ONE_FOOT_TO_KILOMETER_RATIO;
		return result;
	}
	
	//Done
	public int doubleTheNumber(int val)
	{
		return 2 * val;
	}
}
