package ui;

import java.util.Scanner;

import model.Movie;
import util.MyConsole;
import model.Actor;
public class BmdbConsoleApp {

    public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);

	        System.out.println("-----------Welcome to the Bootcamp Movie Database--------");
	        System.out.println("---------Enter Movie Information Below------------ \n");
	        
		MyConsole.promptString("Enter movie title: ");
	        System.out.print("Enter movie title: ");
	        String title = sc.nextLine();

	        System.out.print("Enter movie rating (e.g., PG-13, R, etc.): ");
	        String rating = sc.nextLine();

	        int year = 0;
	        boolean validYear = false;

	       
	        while (!validYear) {
	            System.out.print("Enter release year: ");
	            String input = sc.nextLine();
	            try {
	                year = Integer.parseInt(input);
	                validYear = true;  
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input! Please enter a valid year.");
	            }
	        }

	        System.out.print("Enter director's name: ");
	        String director = sc.nextLine();

	        
	        Movie movie = new Movie(title, year, rating, director);
	        
	        
	        System.out.println("\nMovie Details:");
	        System.out.println(movie.toString());
	        
	        System.out.println("-------------Enter Actor Information Below------------ \n");
	        
	        System.out.print("Enter first name: ");
	        String firstName = sc.nextLine();
	        
	        System.out.print("Enter last name: ");
	        String lastName = sc.nextLine();
	        
	        System.out.print("Enter gender: ");
	        String gender = sc.nextLine();
	        
	        System.out.print("Enter birthdate: ");
	        String birthDate = sc.nextLine();
	        
	        Actor actor = new Actor(firstName, lastName, gender, birthDate);
	        System.out.println("\nActor Details:");
	        System.out.println(actor.toString());
	        
	        ;
	       
	        sc.close();

    }

}
