
//Son Ngo

import java.util.Random;

public class Dice
{
	private int iValue = 0, iBounces;
	
	public Dice ()
	{
		iBounces = 1;
	}
	public Dice(int bounces)
	{
		iBounces = bounces;
	}
	
	public static int OneThrow()
	{
		Random rand = new Random();
		return rand.nextInt(6) + 1;
	}

	public int Throw()
	{
		Dice dice = new Dice();
		iValue = dice.Throw(iBounces);
		
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
