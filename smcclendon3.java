//Sidney McClendon
//csc321
//09/10/24

/* multi line
 *
 *
 */

import java.util.Scanner;

public class smcclendon3
{
	public static void main(String[] args)
	{
		int num = 0;
		double dec = 0.0;
		char letter = ' ';
		String word = "";

		//input from the user now
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		num = input.nextInt();

		if (num > 1)
		{
			System.out.println("The integer is greater than 1.");
		}
	
		//prompt user for double
		System.out.println("Enter a double: ");
		dec = input.nextDouble();

		if (dec < 10.5)
		{
			System.out.println("The double is less than 10.5");
		}

		//prompt user for char
		System.out.println("Enter a character: ");
		letter = input.next().charAt(0);

		if (letter != 'a')
		{
			System.out.println("The chracter does not equal the letter 'a'.");
		}

		//prompt user for string
		System.out.println("Enter a string: ");
		word = input.next();

		if (!word.equals("hello"))
		{
			System.out.println("The string is not 'hello'.");
		}

		int choice = 0;
		System.out.println("Enter a number between 1-5 inclusive: ");
		choice = input.nextInt();

		while (choice < 1 || choice > 5)
		{
			System.out.println("You have entered an incorrect number.");
			System.out.println("Enter a number between 1-5 inclusive: ");
			choice = input.nextInt();
		}

		for(int i = 0; i < choice; i++)
		{
			switch(choice)
			{
				case 1:
					System.out.println("You have won an iphone 15 pro!");
					break;
				case 2:
					System.out.println("You have won a $500 fortnite vbucks card!");
					break;
				case 3:
					System.out.println("You have won a ps5 gaming console!");
					break;
				case 4:
					System.out.println("You have won a pair of airpod pro max headphones!");
					break;
				case 5:
					System.out.println("You have won a paid trip to Disneyland!");
					break;
				default:
					System.out.println("Wrong number.");
					break;
			}
		}
	}
}
