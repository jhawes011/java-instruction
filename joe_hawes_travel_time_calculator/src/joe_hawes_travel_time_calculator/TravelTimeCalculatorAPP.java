package joe_hawes_travel_time_calculator;

import java.util.Scanner;

public class TravelTimeCalculatorAPP {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Welcome to the Travel Time Calculator");
	        
	        char continueChoice;
	        do {
	           
	            System.out.print("Enter miles: ");
	            double miles = scanner.nextDouble();
	            
	            System.out.print("Enter miles per hour: ");
	            double speed = scanner.nextDouble();
	            
	          
	            double timeInHours = miles / speed;
	            int hours = (int) timeInHours;
	            int minutes = (int) ((timeInHours - hours) * 60);
	            
	           
	            System.out.println("\nEstimated travel time");
	            System.out.println("---------------------");
	            System.out.println("Hours: " + hours);
	            System.out.println("Minutes: " + minutes);
	            
	           
	            System.out.print("Continue? (y/n): ");
	            continueChoice = scanner.next().charAt(0);
	            
	        } while (continueChoice == 'y' || continueChoice == 'Y');
	        
	        scanner.close();

	}

}
