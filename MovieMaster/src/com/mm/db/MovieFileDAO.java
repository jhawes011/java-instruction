package com.mm.db;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.mm.model.Movie;

import util.MyConsole;

public class MovieFileDAO implements DAO<Movie>
{
	// p. 289 How to work with file IO
	private static final String FILENAME = "movies.txt";
	private static final String SEP = "|";
	private List<Movie> movies = new ArrayList<>();

	@Override
	public List<Movie> getAll()
		{
			if (movies.size() == 0)
			{

				try (BufferedReader in = new BufferedReader(new FileReader(FILENAME)))
				{
					String line = in.readLine();
					while (line != null)
					{

						String[] cols = line.split("\\" + SEP);
						int id = Integer.parseInt(cols[0]);
						String title = cols[1];
						int year = Integer.parseInt(cols[2]);
						String rating = cols[3];
						String director = cols[4];

						// create a movie object
						Movie m = new Movie(id, title, year, rating, director);
						movies.add(m);
						line = in.readLine();
					}
				} catch (FileNotFoundException e)
				{
					MyConsole.printL("File not found." + FILENAME);
					e.printStackTrace();
				} catch (IOException e)
				{

					e.printStackTrace();
				}
			}
			return movies;
		}

	// NOT YET IMPLEMENTED
	@Override
	public Movie getById(int id)
		{
			// TODO Auto-generated method stub
			return null;
		}

	@Override
	public Movie add(Movie m)
		{
			// add the movie to the list
			movies.add(m);
			// write the movie to the file
			saveMovieFile();

			return m;
		}

	// NOT YET IMPLEMENTED
	@Override
	public void update(Movie t)
		{
			// TODO Auto-generated method stub

		}

	@Override
	public void delete(int id)
		{
			Movie delMovie = null;
			for (Movie m : movies)
			{
				if (m.getId() == id)
				{
					delMovie = m;

				}

			}
			movies.remove(delMovie);
			saveMovieFile();
			// remove the movie from the list
			// write the list to the file

		}

	private void saveMovieFile()
		{
			try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(FILENAME, true))))
			{
				for (Movie m : movies)
				{
					out.print(m.getId() + SEP);

					out.print(m.getTitle() + SEP);

					out.print(m.getYear() + SEP);

					out.print(m.getRating() + SEP);

					out.println(m.getDirector() + SEP);

				}

			} catch (FileNotFoundException e)
			{
				MyConsole.printL("File not found." + FILENAME);
				e.printStackTrace();
			} catch (IOException ioe)
			{
				MyConsole.printL(ioe.getMessage());
			}
			// write the list to the file
		}

}
