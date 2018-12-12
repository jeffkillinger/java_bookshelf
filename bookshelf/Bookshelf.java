package bookshelf;

import java.util.Scanner;

public class Bookshelf {
	static Book[] bookshelf = new Book[100];
	
	
	public static void main(String[] args) {		
		
		populate();
		
		menu();

	}
	
	
	public static void add() {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What is the name of the book you would like to add? ");
		String title = scnr.nextLine();
		
		System.out.println("Who is the author? ");
		String author = scnr.nextLine();
		
		System.out.println("What is the genre? ");
		
		String genre = scnr.nextLine();
		
		System.out.println("How many pages long is the book? ");
		int pageCount = scnr.nextInt();
		
		scnr.close();
		
		int i = 0;
		while (bookshelf[i].title != ""){
			i++;
		}
		bookshelf[i+1] = new Book(title, author, genre, pageCount);
	
		
	}
	
	public static void remove() {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What is the name of the title you would like to remove? ");
		String titleToRemove = scnr.nextLine();
		
		for (int i = 0; i < bookshelf.length; i++) {
			if(bookshelf[i].title == titleToRemove) {
				//Remove title from array somehow
			}
		}
		scnr.close();
		
	}
	
	public static void find() {
		System.out.println("Are you looking for an author or a title?");
		System.out.println("a-- author");
		System.out.println("t-- title");
		
		Scanner scnr = new Scanner(System.in);
		String choice = scnr.next();
		
		if (choice.charAt(0) == 'a') {
			System.out.println("Enter name of author to find books:");
			Scanner auth = new Scanner(System.in);
			String author = auth.nextLine();
		
			
			for (int i = 0; i < bookshelf.length; i++) {
				if(bookshelf[i].author.equals(author)) {
					System.out.println("Books by author: ");
					System.out.println(bookshelf[i].title);
				}
			}
		}
		else if (choice.charAt(0) == 't') {
			System.out.println("Enter name of title:");
			Scanner bookTitle = new Scanner(System.in);
			String title = bookTitle.nextLine();
		
			
			for (int i = 0; i < bookshelf.length; i++) {
				if(bookshelf[i].title.equals(title)) {
					System.out.println(title + " is by " + bookshelf[i].author + " and is " + bookshelf[i].pageCount + " pages long.");
				}
			}
		}
		else {
			System.out.println("Not a valid option");
		}
	}
	
	public static void suggest() {
		//randomize a number between indices
		//print resulting book to console
	}
	
	public static void display() {
		for(int i = 0; i < bookshelf.length; i++) {
			if (bookshelf[i].title != "") {
				System.out.println(bookshelf[i].title + " by " + bookshelf[i].author);
			}
		}
	}
	

	public static void populate() {
		//Add current library
		bookshelf[0] = new Book("Oh the Glory of it All", "Sean Wilsey", "Memoir", 512);
		bookshelf[1] = new Book("White Teeth", "Zadie Smith", "Literary", 464);
		bookshelf[2] = new Book("Lincoln in the Bardo", "George Saunders", "Literary", 343);
		bookshelf[3] = new Book("The Positronic Man", "Isaac Asimov", "Sci-Fi", 204);
		bookshelf[4] = new Book("Born Standing Up", "Steve Martin", "Memoir", 207);
		bookshelf[5] = new Book("Foundation", "Isaac Asimov", "Sci-Fi", 200);
		bookshelf[6] = new Book("Plainsong", "Kent Haruf", "Literary", 301);
		bookshelf[7] = new Book("The Fifth Season", "N. K. Jemisin", "Fantasy", 512);
		bookshelf[8] = new Book("The Obelisk Gate", "N. K. Jemisin", "Fantasy", 448);
		bookshelf[9] = new Book("The Stone Sky", "N. K. Jemisin", "Fantasy", 464);
		bookshelf[10] = new Book("Dune", "Frank Herbert", "Sci-Fi", 204);
		bookshelf[11] = new Book("Housekeeping", "Marilynne Robinson", "Literary", 219);
		bookshelf[12] = new Book("Grant", "Ron Chernow", "Biography", 1104);
		bookshelf[13] = new Book("A Brief History of Seven Killings", "Marlon James", "Literary", 704);
		bookshelf[14] = new Book("Home", "Marilynne Robinson", "Literary", 336);
		bookshelf[15] = new Book("A Visit From the Goon Squad", "Jennifer Egan", "Literary", 352);
		bookshelf[16] = new Book("A Book of Common Prayer", "Joan Didion", "Literary", 272);
		bookshelf[17] = new Book("Contact", "Carl Sagan", "Sci-Fi", 448);
		bookshelf[18] = new Book("Beloved", "Toni Morrison", "Literary", 321);
		bookshelf[19] = new Book("The Shock Doctrine", "Naomi Klein", "Politics", 720);
		bookshelf[20] = new Book("Dark Money", "Jane Mayer", "Politics", 576);
		bookshelf[21] = new Book("A Colony in a Nation", "Chris Hayes", "Politics", 272);
		bookshelf[22] = new Book("Democracy in Chains", "Nancy MacLean", "Politics", 368);
		bookshelf[23] = new Book("Give Me Liberty", "Naomi Wolf", "Politics", 376);
		for (int i = 24; i < 100; i++) {
			bookshelf[i] = new Book("", "", "", 0);
		}
	}
	
	public static void menu() {
		//Bookshelf Menu
		System.out.println("What would you like to do to your bookshelf?");
		System.out.println("a-- add book");
		System.out.println("r-- remove book");
		System.out.println("f-- find a book");
		System.out.println("d-- display books");
		System.out.println("s-- suggest a book");
		
		Scanner scnr = new Scanner(System.in);
		String menuItem = scnr.next();
		
		if (menuItem.charAt(0) == 'a') {
			add();
			display();
		}
		else if (menuItem.charAt(0) == 'r') {
			remove();
			display();
		}
		else if (menuItem.charAt(0) == 'f') {
			find();
		}
		else if (menuItem.charAt(0) == 'd') {
			display();
		}
		else if (menuItem.charAt(0) == 's') {
			suggest();
		}
		
		
		scnr.close();
	}
	
}


