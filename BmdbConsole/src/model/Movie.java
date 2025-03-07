package model;
import java.util.Scanner;
public class Movie {

    
	private String title;
	private int year;
	private String rating;
	private String director;
	
	public Movie(String title, int year, String rating, String director) 
	{
	        this.title = title;
	        this.year = year;
	        this.rating = rating;
	        this.director = director;
	}
	 @Override
	    public String toString()
	 {
	        return "Movie: " + title + ", Rating: " + rating + ", Year: " + year + ", Director: " + director;
	 }
    
    

}
