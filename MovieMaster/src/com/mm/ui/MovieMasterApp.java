package com.mm.ui;
import com.mm.db.MovieDBDAO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mm.db.DAO;
import com.mm.db.MovieFileDAO;
import com.mm.model.Movie;

import util.MyConsole;

public class MovieMasterApp {
	private static DAO<Movie> movieDAO = new MovieDBDAO();
	private static List<String> ratings = new ArrayList<>(Arrays.asList("G", "PG", "PG-13", "R", "NR"));
	public static void main(String[] args) {
		MyConsole.printHeader("-----------Welcome to Movie Master App!----------");
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = MyConsole.promptString("Enter a command: ");
			switch (command) {
			case "all":
				displayAllMovies();
				break;
			case "add":
				addMovie();
				break;
			case "del":
				deleteMovie();
				break;
			case "exit":
				break;
			default:
				MyConsole.printL("Invalid command. Try again.");
			}
		}
		MyConsole.printL("-----------Thank you for using Movie Master App!----------");

	}

	private static void displayAllMovies() {
		MyConsole.printHeader("List of All Movies", "+");
		movieDAO.getAll().forEach(m -> MyConsole.printL(m.toString()));

	}

	private static void addMovie() {
		MyConsole.printHeader("Add Movie", "+");
		int id = MyConsole.promptInt("Movie ID: ");
		String title = MyConsole.promptString("Title: ");
		int year = MyConsole.promptInt("Year: ");
		String rating = MyConsole.promptString("Rating: ", ratings);
		String director = MyConsole.promptString("Director: ");
		movieDAO.add(new Movie(id, title, year, rating, director));
		MyConsole.printL("Movie added.");
	}

	private static void deleteMovie() {
		MyConsole.printHeader("Delete Movie", "+");
		int id = MyConsole.promptInt("Movie ID: ");
		movieDAO.delete(id);
		MyConsole.printL("Movie deleted.");
	}

	private static void displayMenu() {
		MyConsole.printL("Menu:");
		MyConsole.printL("===================");
		MyConsole.printL("all - Get All Movies");
		MyConsole.printL("add - Add A Movie");
		MyConsole.printL("del - Update A Movie");
		MyConsole.printL("exit");
	}
}
