package com.skilldistillery.filmquery.app;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.filmquery.database.DatabaseAccessor;
import com.skilldistillery.filmquery.database.DatabaseAccessorObject;
import com.skilldistillery.filmquery.entities.Film;

public class FilmQueryApp {

	private DatabaseAccessor db = new DatabaseAccessorObject();

	public static void main(String[] args) {
		FilmQueryApp app = new FilmQueryApp();

		app.launch();
	}

	private void launch() {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Film Query App!");
		startUserInterface(input);
		input.close();

	}

	private void startUserInterface(Scanner input) {
		// menu
		boolean go = true;

		do {
			System.out.println("\nPlease select a menu option\n "
					+ "1. Look up a film by ID.\n 2. Look up a film by keyword.\n" + " 3. Exit. ");

			while (!input.hasNextInt()) {
				System.out.println("Please enter a number for the menu option");
				input.next();
			}
			int userIn = input.nextInt();

			if (userIn == 1) {
				try {
					lookupFilmbyID(input);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (userIn == 2) {
				searchByKeyWord(input);

			} else if (userIn == 3) {
				System.out.println("Goodbye");
				go = false;
			} else {
				System.out.println("Please enter 1 or 2");
			}

		} while (go == true);

	}

	public void lookupFilmbyID(Scanner input) throws SQLException {
		System.out.println("Please enter the film ID");
		while (!input.hasNextInt()) {
			System.out.println("Please enter a number for the film ID");
			input.next();
		}
		int filmId = input.nextInt();

		Film film = db.findFilmById(filmId);
		if (film == null)
			System.out.println("Sorry, that film ID does not exist");
		else {
			System.out.println(film);
		}
		

	}

	public void searchByKeyWord(Scanner input) {
		System.out.println("Plese enter a search word");
		String keyWord = input.next();

		List<Film> result = db.findByKey(keyWord);
		if (result.size() > 0) {
			for (Film film : result) {

				System.out.println(film);
			}

		} else {
			System.out.println("No matches where found");

		}

	}

}
