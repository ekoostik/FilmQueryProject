package com.skilldistillery.filmquery.app;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.filmquery.database.DatabaseAccessor;
import com.skilldistillery.filmquery.database.DatabaseAccessorObject;
import com.skilldistillery.filmquery.entities.Actor;
import com.skilldistillery.filmquery.entities.Film;

public class FilmQueryApp {

	DatabaseAccessor db = new DatabaseAccessorObject();

	public static void main(String[] args) throws SQLException {
		FilmQueryApp app = new FilmQueryApp();

		app.launch();
	}

	private void launch() {
		Scanner input = new Scanner(System.in);

		startUserInterface(input);

		input.close();
	}

	private void startUserInterface(Scanner input) {
		// menu
		boolean go = true;

		System.out.println("Welcome to the Film Query App!");
		do {
			System.out.println("\nPlease select a menu option\n "
					+ "1. Look up a film by ID.\n 2. Look up a film by keyword.\n" + " 3. Exit. ");

			while (!input.hasNextInt()) {
				System.out.println("Please enter a number for the menu option");
				input.next();
			}
			int userIn = input.nextInt();

			if (userIn == 1) {
				lookupFilmbyID();
			} else if (userIn == 2) {
				searchByKeyWord();

			} else if (userIn == 3) {
				System.out.println("Goodbye");
				go = false;
			} else {
				System.out.println("Please enter 1 or 2");
			}

		} while (go == true);

	}

	public void lookupFilmbyID() {
		System.out.println("searching for film by id");

	}

	public void searchByKeyWord() {
		System.out.println("searching for keyword");

	}

}
