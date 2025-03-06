package demo_common_divisor;

import java.util.Scanner;

public class CommonDivisorAPP {

    public static void main(String[] args) 
    {
	
	
	System.out.println("Welcome to the Common Divisor Finder");
	
	Scanner sc = new Scanner(System.in);
	
	String choice = "y";
	while (choice.equalsIgnoreCase("y"))
	{
	    System.out.println("Enter x: ");
	    int x = Integer.parseInt(sc.nextLine());
	    System.out.println("Enter y: ");
	    int y = Integer.parseInt(sc.nextLine());
	    
	    while(x != 0)
	    {
		while (y >= x)
		{
		    y -= x;
		}
		int hold = y;
		y = x;
		x = hold;
	    }
	    System.out.println("\nGreatest common divisor: " + y);
	    System.out.println("Continue? (y/n): ");
	    choice = sc.nextLine();
	}
	
	sc.close();
	System.out.println("Goodbye-------------------!");

    }

}
