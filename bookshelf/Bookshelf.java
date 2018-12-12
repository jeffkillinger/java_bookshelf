package bookshelf;

import java.util.Scanner;

public class Bookshelf {

	public static void main(String[] args) {		
		Book[] bookshelf = new Book[100];
		
		for (int i = 0; i < 25; i++) {
			bookshelf[i] = new Book("", "", "", 0);
		}
		
		bookshelf[0] = new Book("Oh the Glory of it All", "Sean Wilsey", "Memoir", 484);
		
		bookshelf[2].author = "George Saunders";
		
		System.out.println(bookshelf[2].getAuthor());
		
		System.out.println(bookshelf[0].getAuthor());
		
		int length = bookshelf.length;
		
		//bookshelf[length + 1] = add();
		
		//Bookshelf Menu
		System.out.println("What would you like to do to your bookshelf? \n a-- add book \n r-- remove book \n f-- find a book \n d-- display books \n s-- suggest a book");
		Scanner scnr = new Scanner(System.in);
		String menuItem = scnr.next();
		
		if (menuItem.charAt(0) == 'a') {
			add();
		}
		else if (menuItem.charAt(0) == 'r') {
			
		}
		else if (menuItem.charAt(0) == 'f') {
			
		}
		else if (menuItem.charAt(0) == 'd') {
			
		}
		else if (menuItem.charAt(0) == 's') {
			
		}
	}
	
	
	
	public static Book add() {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What is the name of the book you would like to add? ");
		String title = scnr.nextLine();
		
		
		System.out.println("Who is the author? ");
		String author = scnr.nextLine();
		
		System.out.println("What is the genre? ");
		
		String genre = scnr.nextLine();
		
		System.out.println("How many pages long is the book? ");
		int pageCount = scnr.nextInt();
		
		//Lots of problems with below attempt to add
		scnr.close();
		
 
		return new Book(title, author, genre, pageCount);
		
		}
	
	public static void remove() {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What is the name of the title you would like to remove? ");
		String titleToRemove = scnr.nextLine();
		
		//for (int i = 0; i < bookshelf.length; i++) {
		//	if(bookshelf[i].title = titleToRemove) {
				//Remove title from array somehow
			//}
		//}
		
		
	}
	
	public static void search() {
		
	}
	
	public static void recommend() {}
	
	

}

