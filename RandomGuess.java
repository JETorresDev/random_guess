// Chapter 6 Game Zone Exercise (pg 234)

import javax.swing.JOptionPane;

public class RandomGuess
{
	public static void main(String[] args)
	{
		//Variables and objects
		final int LOW = 1;
		final int HIGH = 10;
		int magicNumber = (int) (Math.random() * HIGH) + LOW;
		int userGuess;
		int attempts = 1;
		String msg;
		//System.out.println(magicNumber);
		//input phase
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number between " + LOW + " and " + HIGH));

		//Processing phase
		while(userGuess != magicNumber)
		{
			if(userGuess > magicNumber)
			{
				msg = "Sorry, your guess was too high!";
			}
			else
			{
				msg = "Sorry, your guess was too low!";
			}//end of if/else statement

			userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, msg + "\nPlease enter a number between " + LOW + " and " + HIGH));

			//Increment(by 1) the attempts vairable before the guess is checked again
			attempts += 1;
		}//end of WHILE loop

		//Output phase
		JOptionPane.showMessageDialog(null, "YOU'VE WON! \nThe magic number was: " + magicNumber + "\nYou guessed it in: " + attempts + " attempt(s)!");

	}//end of main
}//end of class