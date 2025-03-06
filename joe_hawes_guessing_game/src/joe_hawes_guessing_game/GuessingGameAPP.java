package joe_hawes_guessing_game;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameAPP {
    static Scanner sc = new Scanner(System.in);
    public static int count = 0;
    public static void main(String[] args) {
	System.out.println("Welcome to the guessing game");
	
	Random rand = new Random();
	
	String choice = "y";
	while (choice.equalsIgnoreCase("y"))
	{
	    int theNumber = rand.nextInt(100) + 1;
	    
	    int guess = 0; 
	    
	    while (guess != theNumber)
	    {
		System.out.println("Enter your guess: ");
		guess = Integer.parseInt(sc.nextLine());
		count++;
		int diff = guess - theNumber;
		if (diff < -10)
		    {
		    System.out.println("Way too low");
		    }
		else if (diff < 0)
		    {
		    System.out.println("Too low");
		    }
		else if (diff > 10)
		    {
		    System.out.println("Way too high");
		    }
		else if (diff > 0)
		    {
		    System.out.println("Too high");
		    }
	    }
	    
	    
	    DisplayWinnerMessage();
	    System.out.println("Continue? (y/n): ");
	    choice = sc.nextLine();  
	}
	sc.close();
	System.out.println("Thanks for playing the guessing game");
    }
    private static void DisplayWinnerMessage()
    {
    	
	System.out.println("You got it in " + count + " tries.");
    	if (count <= 3)
    	{
    	System.out.println("Great work! You are a mathematical wizard.");
    	}
    	else if (count <= 7)
    	{
    	System.out.println("Not too bad! You've got some potential.");
    	}
    	else
    	{
    	System.out.println("What took you so long? Maybe you should take some lessons.");
    	}
    }

}
