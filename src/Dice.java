
//Son Ngo

import java.util.Random;

public class Dice
{
	private int iValue;

	public int Throw()
	{
		Random rand = new Random();
		iValue = rand.nextInt(6) + 1;
		return iValue;
	}

	public int Value()
	{
		return iValue;
	}
}
