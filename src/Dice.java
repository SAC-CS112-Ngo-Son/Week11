
//Son Ngo

import java.util.Random;

public class Dice
{
	private int iValue = 0;

	public int Throw()
	{
		Random rand = new Random();
		iValue = rand.nextInt(6) + 1;
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
