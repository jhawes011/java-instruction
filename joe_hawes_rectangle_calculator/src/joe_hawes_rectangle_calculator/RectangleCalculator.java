package joe_hawes_rectangle_calculator;

import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Welcome to the Area and Perimeter Calculator");
	        
	        while (true) {
	           
	            System.out.print("Enter length: ");
	            double length = scanner.nextDouble();

	            System.out.print("Enter width: ");
	            double width = scanner.nextDouble();

	            
	            double area = width * length;
	            double perimeter = 2 * width + 2 * length;

	          
	            System.out.println("Area: " + area);
	            System.out.println("Perimeter: " + perimeter);
	            
	          
	            System.out.print("Continue? (y/n): ");
	            String choice = scanner.next();
	            
	            if (!choice.equalsIgnoreCase("y")) {
	                break;
	            }
	        }
	        
	        System.out.println("Goodbye!");
	        scanner.close();
	    
		

	}

}
