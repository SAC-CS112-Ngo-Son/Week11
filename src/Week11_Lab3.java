
//Son Ngo

import javax.swing.JOptionPane;

public class Week11_Lab3
{

	public static void main(String[] args)
	{
		int iGuess, iRoll, iChoice, iBounces;

		do
		{
			iGuess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess: "));
			iBounces = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of bounces: "));
			Dice dice = new Dice(iBounces);
			iRoll = dice.Throw(iBounces);

			while ((iGuess < 1) || (iGuess > 6))
			{
				iGuess = Integer.parseInt(JOptionPane.showInputDialog("Enter a number within range: "));
			}

			if (iGuess == iRoll)
			{
				iChoice = JOptionPane.showConfirmDialog(null,
						String.format(
								"You guessed %d. The computer rolled %d.\n Your guess is correct. Do you want to continue?",
								iGuess, dice.Value()),
						null, JOptionPane.YES_NO_OPTION);

			} else
			{
				iChoice = JOptionPane.showConfirmDialog(null,
						String.format(
								"You guessed %d. The computer rolled %d.\n Your guess is incorrect. Do you want to continue?",
								iGuess, dice.Value()),
						null, JOptionPane.YES_NO_OPTION);
			}
		} while (iChoice == JOptionPane.YES_OPTION);

		if (iChoice == JOptionPane.NO_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Thanks for playing. Goodbye.");
		}
	}
}
