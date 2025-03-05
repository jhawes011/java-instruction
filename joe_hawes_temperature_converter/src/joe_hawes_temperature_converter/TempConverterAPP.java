package joe_hawes_temperature_converter;

import java.util.Scanner;

public class TempConverterAPP {

	public static void main(String[] args) {
System.out.println("-----Welcome to the temperature converter--------\n");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y"))
		{
		double fTemp = 0;
		double cTemp = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter degrees in Fahrenheit: ");
		fTemp = sc.nextDouble();
		sc.nextLine();
		
		cTemp = (fTemp - 32) * 5/9;
		System.out.println("Degrees in Celsius: " + ((double)Math.round(cTemp*100) / 100));
		
		
		
		System.out.print("Continue?");
		choice = sc.nextLine();
		}
		
		System.out.println("----------Goodbye------------");

	}

}
