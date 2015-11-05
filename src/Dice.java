
//Son Ngo

import java.util.Random;

public class Dice
{
	private int iValue = 0, iBounces = 1;
	
	public Dice(int bounces)
	{
		iBounces = bounces;
	}

	public int Throw()
	{
		Random rand = new Random();

		for (int i = 1; i < iBounces + 1; i++)
		{
			iValue = iValue + rand.nextInt(6) + 1;
		}

		iValue = iValue / iBounces;
		
		return iValue;
	}

	public int Throw(int bounces)
	{
		Random rand = new Random();

		for (int i = 1; i < bounces + 1; i++)
		{
			iValue = iValue + rand.nextInt(6) + 1;
		}

		iValue = iValue / bounces;

		return iValue;
	}

	public int Value()
	{
		return iValue;
	}
}
