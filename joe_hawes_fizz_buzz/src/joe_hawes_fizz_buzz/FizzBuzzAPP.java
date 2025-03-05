package joe_hawes_fizz_buzz;

import java.util.Scanner;

public class FizzBuzzAPP {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to the Fizz Buzz Game");
	
	
	String choice = "y";
	while (choice.equalsIgnoreCase("y"))
	{
	    
	    System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        sc.nextLine();
	        for (int i = 1; i <= n; i++) {
	            if (i % 3 == 0 && i % 5 == 0) {
	                System.out.println("fizzbuzz");
	            } else if (i % 3 == 0) {
	                System.out.println("fizz");
	            } else if (i % 5 == 0) {
	                System.out.println("buzz");
	            } else {
	                System.out.println(i);
	            }
	        }
	    
	    
	    
	        
	    System.out.print("Continue?");
	    choice = sc.nextLine();  
	}
	    
	System.out.println("Goodbye!");
    }

}
