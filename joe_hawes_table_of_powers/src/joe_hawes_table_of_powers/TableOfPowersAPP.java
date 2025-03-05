package joe_hawes_table_of_powers;

import java.util.Scanner;

public class TableOfPowersAPP {

	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Welcome to the Squares and Cubes table");
	        
	        while (true)
	        {
	            System.out.print("Enter an integer: ");
	            int num = scanner.nextInt();
	            displayTable(num);
	            
	            System.out.print("Continue? (y/n): ");
	            String cont = scanner.next().trim().toLowerCase();
	            if (!cont.equals("y"))
	            {
	                break;
	            }
	        }

	}
	public static void displayTable(int n) {
	        System.out.println("Number Squared Cubed");
	        System.out.println("====== ======= =====");
	        
	        for (int i = 1; i <= n; i++) {
	            int square = i * i;
	            int cube = i * i * i;
	            System.out.printf("%-6d %-7d %-5d%n", i, square, cube);
	        }
	    }
}
