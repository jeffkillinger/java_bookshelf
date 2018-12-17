package bookshelf;

import java.util.Arrays;
import java.util.Scanner;


public class Bookshelf {
	//establish new bookshelf with size of all books
	static Book[] bookshelf = new Book[24];
	
	public static void main(String[] args) {		
		//populate the bookshelf with elements included in populate() method
		populate();
		
		//pull up menu for user
		menu();

	}
	
	public static void add() {
		Scanner scnr = new Scanner(System.in);
		
		//Collect relevant data from user regarding new book to add
		System.out.println("What is the name of the book you would like to add? ");
		String title = scnr.nextLine();
		
		System.out.println("Who is the author? ");
		String author = scnr.nextLine();
		
		System.out.println("What is the genre? ");
		
		String genre = scnr.nextLine();
		
		System.out.println("How many pages long is the book? ");
		int pageCount = scnr.nextInt();
		
		//Make new array with added length to accommodate new book
		Book[] copyBookshelf = Arrays.copyOf(bookshelf, bookshelf.length + 1);
		
		//Copy contents back (with added length)
		bookshelf = Arrays.copyOf(copyBookshelf, copyBookshelf.length);

		//Place new book at the end of the shelf
		bookshelf[bookshelf.length - 1] = new Book(title, author, genre, pageCount);
	
	}
	
	public static void remove() {
		Scanner scnr = new Scanner(System.in);
		
		//Make copy of bookshelf array minus one in length for removal
		Book[] copyBookshelf = new Book[bookshelf.length - 1];
		
		System.out.println("What is the title you would like to remove? ");
		String titleToRemove = scnr.nextLine();
		
		int badIndex;
		
		for (int i = 0; i < copyBookshelf.length; i++) {
			//find index of book to remove
			if(titleToRemove.equals(bookshelf[i].title)) {
				badIndex = i; 
			}
			//because it made me have an alternative in case the if condition above wasn't met
			else {
				badIndex = 99;
			}
			
			//copy everything prior to book to be removed
			for (int j = 0; j < badIndex; j++) {
				copyBookshelf[i] = bookshelf[i];
			}
			
			//copy everything after book to be removed
			for (int j = badIndex + 1; j < bookshelf.length; j++) {
				copyBookshelf[i] = bookshelf[j];
			}
		}
		
		//set your old bookshelf to the new reduced version
		bookshelf = copyBookshelf.clone();

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
			
			//iterate through authors and print their titles
			System.out.println("Books by author: ");
			for (int i = 0; i < bookshelf.length; i++) {
				if(bookshelf[i].author.equals(author)) {
					System.out.println(bookshelf[i].title);
				}
			}
		}
		
		//return title and information
		else if (choice.charAt(0) == 't') {
			System.out.println("Enter name of title:");
			Scanner bookTitle = new Scanner(System.in);
			String title = bookTitle.nextLine();
		
			
			for (int i = 0; i < bookshelf.length; i++) {
				if(bookshelf[i].title.equals(title)) {
					System.out.println(title + " is by " + bookshelf[i].author + " and is " + bookshelf[i].pageCount + " pages long.");
					System.out.println("\n");
				}
			}
		}
		//return to menu if they don't select a valid option
		else {
			System.out.println("Not a valid option");
			System.out.println("\n");
			menu();
		}
	}
	
	public static void suggest() {
		//randomize a number between indices
		int bookNum = 0;
		
		for(int i = 0; i < bookshelf.length; i++) {
			if (bookshelf[i].title != "") {
				bookNum++;
			}
		}
		
		int random = (int)(Math.random() * bookNum + 1);
		//print resulting book to console
		System.out.println("Read " + bookshelf[random].title + " by " + bookshelf[random].author);
		
		System.out.println("\n");
	}
	
	public static void display() {
		for(int i = 0; i < bookshelf.length; i++) {
			System.out.println(bookshelf[i].title + " by " + bookshelf[i].author);
		}
		System.out.println("\n");
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

	}
	
	public static void menu() {
		//Bookshelf Menu
		System.out.println("What would you like to do to your bookshelf?");
		System.out.println("a-- add book");
		System.out.println("r-- remove book");
		System.out.println("f-- find a book");
		System.out.println("d-- display books");
		System.out.println("s-- suggest a random book");
		System.out.println("q-- quit");
		
		Scanner scnr = new Scanner(System.in);
		String menuItem;
		
		if (scnr.hasNext()) {
			menuItem = scnr.next();
		}
		else {
			menuItem = String.valueOf('q');
		}
		
		switch (menuItem.charAt(0))
		{
		case 'a': 
			add();
			display();
			menu();
			break;
		
		case 'r':
			remove();
			display();
			menu();
			break;
			
		case 'f':
			find();
			menu();
			break;
			
		case 'd':
			display();
			menu();
			break;
			
		case 's':
			suggest();
			menu();
			break;
			
		case 'q':
			System.out.println("Goodbye!");
			break;
			
		default:
			System.out.println("Input did not match menu option. Please try again");
			System.out.println("\n");
			menu();
		}
		
		scnr.close();
	}
	
}


